package Sprint1;

import java.io.*;
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] asci = new int[20000];

        boolean tr = true;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            String str1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            String str2 = bufferedReader.readLine(); //читаем строку с клавиатуры

            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();

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
                if(asci[i] != 0)
                   tr = false;
            }

            if(tr){
                System.out.println("True");
            }else{
                System.out.println("False");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
