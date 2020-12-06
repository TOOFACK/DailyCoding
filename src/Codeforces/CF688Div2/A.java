package Codeforces.CF688Div2;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        HashMap<Integer, Integer> str = new HashMap<>();
        HashMap<Integer, Integer> col = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int j = 0;

        boolean vseOk = true;

        while (j < temp) {
            int amStr = in.nextInt();
            int amCol = in.nextInt();

//            System.out.println("amStr = " + amStr);
//            System.out.println("amCol = " + amCol);

            for (int i = 0; i < amStr; i++) {
                int val = in.nextInt();
//                System.out.println("val = " + val);
                str.put(val, val);
            }

            for (int i = 0; i < amCol; i++) {
                int val = in.nextInt();
//                System.out.println("val = " + val);
                col.put(val, val);
            }

            int am = 0;
            if(amStr > amCol){
                Set<Integer> vals =  str.keySet();
                for(int t : vals){
                    if(col.containsKey(t)){
                        am++;
                    }
                }
            } else {
                Set<Integer> vals =  col.keySet();
                for(int t : vals){
                    if(str.containsKey(t)){
                        am++;
                    }
                }
            }
            ans.add(am);
            col.clear();
            str.clear();
            j++;
        }

        for(int i : ans){
            System.out.println(i);
        }



    }
}
