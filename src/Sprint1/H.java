package Sprint1;

import java.io.*;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            boolean trigger = true;
            String word = bufferedReader.readLine(); //читаем строку с клавиатуры
            word = word.replaceAll("[,.:]", "");
            word = word.replaceAll(" ", "");
            word = word.toLowerCase();
            char[] str = word.toCharArray();

            for(int i = 0; i < str.length; i++){
                if(str[i] == str[str.length - 1 -i]){
                    continue;
                } else{
                    trigger = false;
                    break;
                }
            }
            if(trigger){
                System.out.println("True");
            }else
                System.out.println("False");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
