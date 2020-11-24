package Sprint1;

import java.io.*;
import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            String str1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            String str2 = bufferedReader.readLine(); //читаем строку с клавиатуры

            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();

            int[] asci = new int[255];

            if(s1.length > s2.length){
                for(int i = 0; i < s1.length; i++){
                    asci[(int)(s1[i])]++;
                }
                for(int i = 0; i< s2.length; i++){
                    asci[(int)s2[i]]--;
                }
            } else{

                for(int i = 0; i< s2.length; i++){
                    asci[(int)s2[i]]++;
                }
                for(int i = 0; i < s1.length; i++){
                    asci[(int)(s1[i])]--;
                }

            }
            for(int i = 0; i < asci.length; i++){
                if(asci[i] == 1)
                    System.out.println((char)i);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}