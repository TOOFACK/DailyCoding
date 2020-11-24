package Sprint1;

import java.io.*;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            String fNum = bufferedReader.readLine(); //читаем строку с клавиатуры
            String sNum = bufferedReader.readLine(); //читаем строку с клавиатуры

            StringBuilder fl = new StringBuilder(fNum);
            StringBuilder sl = new StringBuilder(sNum);


            if (sNum.length() != fNum.length()) {
                int m = Math.max(sNum.length(), fNum.length());
                int min = Math.min(sNum.length(), fNum.length());

                if (sNum.length() < fNum.length()) {
                    for (int i = 0; i < (m - min); i++) {
                        sl.insert(i, "0");
                    }
                }
                if (sNum.length() > fNum.length()) {
                    for (int i = 0; i < (m - min); i++) {
                        fl.insert(i, "0");
                    }

                }
            }

            String f1 = fl.toString();
            String s1 = sl.toString();


            char[] f = f1.toCharArray();
            char[] s = s1.toCharArray();


            boolean haveOne = false;
            StringBuilder str = new StringBuilder("");

            for (int i = s.length - 1; i >= 0; i--) {
                System.out.println("f = " + f[i]);
                System.out.println("s = " + s[i]);
                if (f[i] == '1' && s[i] == '1') {

                    System.out.println("1 == 1");

                    if (haveOne) {
                        str.append("1");
                        System.out.println("1");
                        System.out.println("Have 1");
                        haveOne = true;
                    } else {
                        System.out.println("0");
                        System.out.println("Have 1");
                        haveOne = true;
                        str.append("0");
                    }

                } else if (f[i] != s[i]) {
                    System.out.println("1 and 0");
                    if (haveOne) {
                        str.append("0");
                        haveOne = true;
                        System.out.println("0");
                        System.out.println("Have 1");
                    } else {
                        str.append("1");
                        System.out.println("1");
                    }
                } else if (f[i] == '0' && s[i] == '0') {
                    System.out.println("0 = 0");
                    if (haveOne) {
                        str.append("1");
                        System.out.println("1");
                        haveOne = false;
                    } else {
                        str.append('0');
                        System.out.println("0");
                    }
                }

            }
            if(haveOne){
                str.append("1");
            }
            System.out.println(new StringBuilder(str).reverse().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





























