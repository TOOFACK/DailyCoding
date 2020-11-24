package Sprint3_1;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        int[] mas = new int[temp];
        for(int i =0; i < temp; i++){
            mas[i] = in.nextInt();
        }

        if(mas[0] > mas[1]){
            int t = mas[0];
            mas[0] = mas[1];
            mas[1] = t;
        }


        for(int i =2; i < temp; i++) {
            int swapped = mas[i];
            int index = i;
                for (int j = i - 1; j >= 0; j--) {
                    if (swapped < mas[j]) {
                        mas[index] = mas[j];
                        mas[j] = swapped;
                        index--;
                    }
                }

            }
        for (int s : mas) {
            System.out.print(s + " ");
        }
        System.out.println();
        }

        }

