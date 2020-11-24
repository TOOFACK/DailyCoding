package Sprint1;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] mas = new int[10000];
        int temp = in.nextInt();
        for(int i = 0; i < temp; i++){
            int s = in.nextInt();
            mas[s-1] ++;
        }
        for(int i = 0; i < mas.length; i++){
            if(mas[i] != 2 && mas[i] > 0)
                System.out.println(i+1);
        }
    }
}
