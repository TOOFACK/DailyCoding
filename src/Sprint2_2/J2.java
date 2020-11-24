package Sprint2_2;

import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();//символ
        int n = in.nextInt();//строке

        String strw = "0";
        String s ="";
        StringBuilder str = new StringBuilder(strw);
        StringBuilder newStr = new StringBuilder(s);

        for(int i = 1; i < n; i++) {
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == '0'){
                    newStr.append("01");
                } else{
                    newStr.append("10");
                }
            }
            str = newStr;

        }
        System.out.println(str.charAt(k-1));

    }
}
