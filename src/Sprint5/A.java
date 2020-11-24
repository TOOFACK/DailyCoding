package Sprint5;

import java.util.Scanner;

public class A {
    public static boolean tr = false;
    public static int[] mas = new int[10000000];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(isHappy(in.nextInt()));
    }

      static String isHappy(int n){
        if(mas[n] != 0){
            return "False";
        }
        mas[n] = 1;
        int t = 0;
        while(n > 0){
            t += (int) Math.pow(n % 10,2);
            n /= 10;
        }

        if(t == 1){
            tr = true;
        } else{
            isHappy(t);
        }
          if(tr){
              return "True";
          } else{
              return "False";
          }


    }
}
