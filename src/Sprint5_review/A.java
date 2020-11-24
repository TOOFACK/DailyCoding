package Sprint5_review;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class A {
    static String BASE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
      static int B = 62;

    public static void main(String[] args) throws IOException {

              String PREFIX = "https://prakti.kum/";


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bf.readLine());
        int temp = Integer.parseInt(bf.readLine());

        HashMap<Integer, String> hashMap = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();





        for (int i = 0; i < temp; i++) {
            String[] line = bf.readLine().split(" ");
             
            if (line[0].equals("post")) {


                if (!hashMap2.containsKey(line[1])) {
                    hashMap.put(k, line[1]);
                    hashMap2.put(line[1], k);
                     System.out.println(PREFIX + encoder(k));
                    k++;

                } else {

                    System.out.println(PREFIX + encoder(hashMap2.get(line[1])));
                }
            } else {

                if(line[1].contains(PREFIX)) {

                    System.out.println(hashMap.getOrDefault(decoder(line[1].substring(line[1].lastIndexOf("/")+1)), "error"));
                } else
                     System.out.println("error");


            }

        }


    }


    public static String encoder(int q) {

        int r;
        StringBuilder encodedString = new StringBuilder();
        while (q > 0) {
            r = q % B;
            q = q / B;
            encodedString.insert(0, BASE.charAt(r));

        }

        return String.valueOf(encodedString);
    }

    public static int decoder(String s) {
        int  id = 0;
      int b = 62;

        for (int i = 0; i < s.length(); i++)
        {
            int value = BASE.indexOf(s.charAt(i));
            int num = (int) (value * Math.pow(b, s.length() - i - 1));
            id += num;
        }
        return id;
    }

}
