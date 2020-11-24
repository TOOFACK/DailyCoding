package Sprint1;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        int sum = 0;

        while(val >0){
            if(val % 2 !=0) {
                sum = sum + 1;
            }
            val /= 2;


        }
        System.out.println(sum);

    }
}
