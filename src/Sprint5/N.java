package Sprint5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class N {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String stroka = bf.readLine();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i =0; i < stroka.length(); i++){
            char s = stroka.charAt(i);
            if(hashMap.containsKey(s)){
                int am = hashMap.get(s);
                am++;
                hashMap.put(s,am);
            } else{
                hashMap.put(s,1);
            }
        }
//        System.out.println("keys");
//        System.out.println(hashMap.keySet().toString());
//        System.out.println("vals");
//        System.out.println(hashMap.values().toString());

        int sum = 0;
        boolean haveOne = false;
        Set<Character> keys2 = hashMap.keySet();
        ArrayList<Character> keys = new ArrayList<>(keys2);

        for(int i =0; i < keys.size(); i++){
             char s = keys.get(i);
             int am = hashMap.get(s);
//            System.out.println("am = " + am);
//            System.out.println("key = " + s);
            if(!haveOne && am == 1){
                haveOne = true;
                sum ++;
//                System.out.println("addOne");
            }
             if(am % 2 ==0){
//                 System.out.println("prev " + sum);
                 sum += am;
//                 System.out.println("after" + sum);
             } else if(am > 1 && am % 2 != 0){
                 while(am != 1){
//                     System.out.println("am  = " + am);
                     am = am -2;
                     sum= sum +2;
                 }
                 if(!haveOne){
                     haveOne = true;
                     sum ++;
//                     System.out.println("addOne");
                 }

             }
        }
        System.out.println(sum);

    }
}
