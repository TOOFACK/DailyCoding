package Codeforces.CF689Div2;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> s = new ArrayList<>();
        StringBuilder ans = new StringBuilder();

        int temp = in.nextInt();
        for(int i =0; i < temp; i++){
            int n = in.nextInt();
            int k = in.nextInt();



            int ch = 1;
            boolean stop = false;
            for(int j =0; j < n; j++){
                int h = 0;
                if(stop){
                    break;
                }

                while(h < k){
                    if(ch == 1){
                        ans.append("a");
                    } else if(ch == 2){
                        ans.append("b");
                    } else {
                        ans.append("c");
                    }
                    h++;
                    if(ans.length() == n){
                        stop = true;
                        break;
                    }
                }
                ch++;
                if(ch == 4){
                    ch = 1;
                }



            }

            s.add(String.valueOf(ans));
            ans.delete(0,ans.length());

        }
        for(String s2 : s){
            System.out.println(s2);
        }
    }
}
