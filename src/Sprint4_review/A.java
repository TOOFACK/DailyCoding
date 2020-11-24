package Sprint4_review;

import java.util.Scanner;

public class A {
    static int chet = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        amountOfSeq(n,0,0);
        System.out.println(chet);
    }


    public static  String amountOfSeq(int n, int open, int close){
        if(open + close == 2*n){
            chet++;
             return "";
        }
        if(open < n){
              amountOfSeq(n,open+1,close);
        }
        if(open > close){
              amountOfSeq(n,open,close+1);
        }
        return "";

    }
}
