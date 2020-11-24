package Sprint1;

import java.io.*;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int a = in.nextInt();

        int[] mas = new int[a];

        for(int i =0; i < mas.length; i++){
            mas[i] = in.nextInt();
        }

        int j = -1;
        int zIndex = -1;
        boolean haveZero = true;

        for(int i = 0; i < mas.length; i++){

            if(mas[i] == 0 && haveZero){
                haveZero = false;
                zIndex = i;
//                System.out.println("Zero index = " +i);
            }

            if(zIndex != -1 && mas[i]!=0){
//                System.out.println("First not zero after zero index" + i);
                j = i;
                mas[zIndex] = mas[i];
                mas[i] = 0;
                i = zIndex;
                haveZero = true;
//                System.out.println("Start find a new not zero from index = " + i);

            }
            if(j + 1 > mas.length)
                break;

//            for(int k: mas){
////                System.out.print(k + " ");
//            }

        }

        System.out.println();

        for(int k: mas){
            if(k == 0)
                break;
            out.print(k + " ");
            out.flush();
        }


    }

}
