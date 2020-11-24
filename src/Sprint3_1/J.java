package Sprint3_1;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        int[] mas = new int[temp];
        for (int i = 0; i < temp; i++) {
            mas[i] = in.nextInt();
        }
        int tempObr = in.nextInt();
        int[] masObr = new int[tempObr];
        for (int i = 0; i < tempObr; i++) {
            masObr[i] = in.nextInt();
        }

        int[] chetObr = new int[1500];
        int[] chet = new int[1500];

        for(int s : mas){
            chet[s]++;
        }

        for(int i = 0; i < chet.length; i++){
            for(int s : masObr){
                while(chet[s] > 0){
                    System.out.print(s + " ");
                    chet[s]--;
                }
            }
            while(chet[i] > 0){
                System.out.print(i + " ");
                chet[i]--;
            }



        }



        }

    }

