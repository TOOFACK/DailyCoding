package Sprint3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class M {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabet = br.readLine();
        int temp = in.nextInt();
        String[] mas = new String[temp];
        for(int i =0 ; i < temp; i++){
            mas[i] = br.readLine();
        }
        Arrays.sort(mas);
        for(String s : mas){

        }




    }
}
