package Sprint1;

import javax.print.DocFlavor;
import java.io.*;
import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);




        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            String fNum = bufferedReader.readLine(); //читаем строку с клавиатуры
            char[] mas = fNum.toCharArray();
            int[] counts = new int[10000];

            for(int i = 0; i < mas.length; i++){

                counts[(int)mas[i]]++;

            }
            for(int i = 0; i < mas.length; i++){
                System.out.println(counts[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
