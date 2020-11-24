package Sprint1;

import java.io.*;
import java.net.SecureCacheResponse;
import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            String fNum = bufferedReader.readLine(); //читаем строку с клавиатуры
            char[] mas = fNum.toCharArray();

            for(char f : mas){
//                System.out.print((f) + " ");
                if(f > 0){
                    System.out.print(f);
                }
            }


            int len1 = in.nextInt();
            int len2 = in.nextInt();

            System.out.println(len1);
            System.out.println(len2);
            int[] mas2 = new int[len2];

            for(int i =0; i < len2; i++){
                mas2[i] = in.nextInt();
            }


            int[] ans = new int[len1+len2];

            int k = 0;
            int j = 0;

            for(int i =0; i < ans.length; i++){

                if(k >= len1-1){
                    while (j < len2){
                        ans[i] = mas2[j];
                        j++;
                        i++;
                    }
                    break;
                }

                if(j >= len2-1){
                    while (k < len1){
                        ans[i] = (int)mas[k];
                        k++;
                        i++;
                    }
                    break;
                }

                if((int)mas[k] <= mas2[j]){
                    ans[i] = (int)mas[k];
                    k++;
                }else{
                    ans[i] = mas2[j];
                    j++;
                }

            }
            for(int s : ans){
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
