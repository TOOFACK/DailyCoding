package Sprint1;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        int[] mas = new int[len];


        int max = Integer.MIN_VALUE;

        for(int i =0; i < len; i++){
            mas[i] = in.nextInt();
            if(max < mas[i]){
                max = mas[i];
            }
        }

        int[] counts = new int[max+1];
        for(int k : mas){
            counts[k] ++;
        }

        for(int k=0; k < max + 1; k++){
            if(counts[k] > 1)
                System.out.println(k);
        }

    }
}
