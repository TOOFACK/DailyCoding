package Sprint5_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;


public class B {
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


    }

    private final ArrayList<LinkedList<Pair>> hashTable  = new ArrayList<>();

    public B() {

        for(int i =0; i < 1000; i++){
            hashTable.add(null);
        }

    }

    public void put(int key, int value){

        int k = (key % 1000);

        Pair pair = new Pair(key, value);
        boolean zamena = false;

        if(hashTable.get(k) != null){
            for (int i =0; i < hashTable.get(k).size(); i++){
                if(hashTable.get(k).get(i).getKey() == key){
                    zamena = true;
                    hashTable.get(k).set(i,new Pair(key, value));
                }
            }
            if(!zamena) {
                hashTable.get(k).addFirst(pair);
            }

        } else {
            LinkedList<Pair> linkedList = new LinkedList<>();
            linkedList.add(pair);
            hashTable.set(k,linkedList);
        }

    }

    public String get(int key){


        int k =  ((key % 1000));

        boolean find = false;
        int index = 0;
        if(hashTable.get(k) != null) {

            for (int i = 0; i < hashTable.get(k).size(); i++) {
                if (hashTable.get(k).get(i).getKey() == key) {
                    index = i;
                    find = true;
                    break;
                }
            }

        }if(find){
            return String.valueOf(hashTable.get(k).get(index).getValue());
        } else{
            return("-1");
        }

    }

    public String delete(int key){

        int k =  ((key % 1000));

        boolean tr = false;

        if(hashTable.get(k) != null) {


            for (int i = 0; i < hashTable.get(k).size(); i++) {
                if (hashTable.get(k).get(i).getKey() == key) {
                    hashTable.get(k).remove(i);
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
//

                ans.add(b.get(Integer.parseInt(comm[1])));
            } else{
//
                ans.add(b.delete(Integer.parseInt(comm[1])));
            }
        }
        for(String s : ans){
            System.out.println(s);
        }
    }
}
