package Sprint3_1;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        int[] mas = new int[temp];
        for(int i =0; i < temp; i++){
            mas[i] = in.nextInt();
        }
        for(int i =0; i < temp; i++){
            for(int j =0; j < temp-1; j++){
                if(mas[j] > mas[j+1]){
                    int t = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = t;
                }
            }
        }
        for(int s : mas){
            System.out.print(s + " ");
        }
    }
}
