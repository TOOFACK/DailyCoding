


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;


public class B  {
    static class Pair{
        private int value;
        private int key;

        public Pair(int key, int value) {
            this.value = value;
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }
    }

    private final LinkedList<Pair>[] hashTable  = new LinkedList[1000];
    public B() {


    }

    public void put(int key, int value){

        int k = hashCode(key);
//        System.err.println("put" + " key = " + k);
        Pair pair = new Pair(key, value);

//            hashTable.get(k).add(pair);
        if(hashTable[k] != null){
            hashTable[k].addFirst(pair);
        } else {
            LinkedList<Pair> linkedList = new LinkedList<>();
            linkedList.add(pair);
            hashTable[k] = linkedList;
        }

    }

    public String get(int key){


        int k = hashCode(key);
//        System.err.println("get" + " key = " + k);
        boolean find = false;
        int index = 0;
        if(/*hashTable.get(k).size() != 0*/ hashTable[k] != null){
//            System.out.println("Cuurent stats");

            LinkedList<Pair> linkedList = hashTable[k];
//            for (Pair pair : linkedList) {
//                System.out.println("key = " + pair.getKey() + " " + "val = " + pair.getValue());
//            }

            for(int i = 0; i < linkedList.size(); i++){
                if(linkedList.get(i).getKey() == key){
                    index = i;
                    find = true;
                    break;
                }
            }

        }  if(find){
            return String.valueOf(hashTable[k].get(index).getValue());
        } else{
            return("-1");
        }

    }

    public String delete(int key){

        int k = hashCode(key);
//        System.err.println("delete" + " key = " + k);
        boolean tr = false;
        if(hashTable[k] != null) {
            LinkedList<Pair> linkedList = hashTable[k];

            for (int i = 0; i < linkedList.size(); i++) {
                if (linkedList.get(i).getKey() == key) {
                    linkedList.remove(i);
                    hashTable[k] = linkedList;
                    tr = true;
                    break;
                }
            }
            if(tr){

                return "ok";
            }
        } else{

            return "error";
        }

        return "error";
    }

    private int hashCode(int k){
        return (int)(k * 2654435769L % Math.pow(2,32)) >> (32 - 10);
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> ans = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int temp = Integer.parseInt(bf.readLine());
        B b = new B();
        for(int i =0; i < temp; i++){
            String[] comm = bf.readLine().split(" ");
            if(comm[0].equals("put")){
                b.put(Integer.parseInt(comm[1]),Integer.parseInt(comm[2]));
            } else if(comm[0].equals("get")){
                ans.add(b.get(Integer.parseInt(comm[1])));
            } else{
                ans.add(b.delete(Integer.parseInt(comm[1])));
            }
        }
        for(String s : ans){
            System.out.println(s);
        }
    }
}
