package Sprint1;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            String fNum = bufferedReader.readLine(); //читаем строку с клавиатуры
            StringBuilder str = new StringBuilder("");
            int[] asci = new int[255];
            char[] f = fNum.toCharArray();

            for(int i =0; i < f.length; i++){
                asci[(int)f[i]]++;
            }
            int max = -1;
            int maxInd = -1;

            for(int i =0; i<asci.length; i++){
                 for(int j = 0; j < asci.length; j++){
                     if(max < asci[j]){
                         max = asci[j];
                         maxInd = j;
                     }
                 }

                 while(asci[maxInd] > 0){
                     str.append((char)(maxInd));

                     asci[maxInd] --;
                 }
                 max = -1;

            }
            if(str.equals(fNum)){
                Arrays.sort(f);
                System.out.println(f.toString());
            }else {
                System.out.println(str);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
