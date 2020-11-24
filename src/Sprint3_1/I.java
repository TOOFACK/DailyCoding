package Sprint3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        int[] mas = new int[temp];
        int[] chet = new int[3];
        for(int i =0; i < temp; i++){
            mas[i] = in.nextInt();
            chet[mas[i]]++;
        }


        for(int i = 0; i < chet.length; i++){
            while(chet[i] !=0){
                System.out.print(i + " ");
                chet[i]--;
            }
        }
    }
}
