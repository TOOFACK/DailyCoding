package Sprint2_2;

import java.io.StreamTokenizer;
import java.util.Scanner;

public class J {

    public static int chet = 1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();//символ
        int n = in.nextInt();//строке
        System.out.println(finding(k,n,"0"));


    }

    public static String finding(int k, int n, String str){
        char[] symbols = str.toCharArray();
        String nS = "";
        StringBuilder newStr = new StringBuilder(nS);
        if(chet != n) {
            for (char symbol : symbols) {
                if (symbol == '0') {
                    newStr.append("01");
                } else {
                    newStr.append("10");
                }
            }
//            System.out.println(newStr);
            chet++;
            return finding(k,n, String.valueOf(newStr));
        }
        return String.valueOf(symbols[k-1]);
    }
}
