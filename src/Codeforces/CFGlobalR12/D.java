package Codeforces.CFGlobalR12;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class D {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        int i =0;
        while(i < temp){
            i++;
            ArrayList<Integer> mas = new ArrayList<>();
            int len = in.nextInt();
            for (int j =0; j < len; j++){
                mas.add(in.nextInt());
            }

            ans.addAll((seq(mas)));
            System.out.println(ans);
            ans.clear();
        }


    }

    private static ArrayList<Integer> seq(ArrayList<Integer> mas) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(isOneOrZero(mas));
        for(int i =1; i < mas.size(); i++){
            ArrayList<Integer> tempMas = new ArrayList<>();
            
        }
        return res;
    }

    private static Integer isOneOrZero(ArrayList<Integer> mas) {
        return 0;
    }


}
