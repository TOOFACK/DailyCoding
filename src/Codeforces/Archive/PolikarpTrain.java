package Codeforces.Archive;

import java.util.ArrayList;
 
import java.util.Collections;
import java.util.Scanner;

public class PolikarpTrain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        ArrayList<Integer> contensts = new ArrayList<>();
        for(int i =0; i < temp; i++){
            contensts.add(in.nextInt());
        }


        Collections.sort(contensts);

        int pos =1;
        for(int i : contensts){
            if(i >= pos) pos++;
        }

        System.out.println(pos-1);


    }
}
