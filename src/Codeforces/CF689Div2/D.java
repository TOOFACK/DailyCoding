package Codeforces.CF689Div2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        for (int i = 0; i <temp; i++){
            int n = in.nextInt();
            int q = in.nextInt();
            ArrayList<Integer> mas = new ArrayList<>();
            ArrayList<Integer> check = new ArrayList<>();
            ArrayList<String> ans = new ArrayList<>();

            for(int j = 0; j < n; j++){
                mas.add(in.nextInt());
            }
            for(int j = 0; j < q; j++){
                check.add(in.nextInt());
            }
            for(int qi : check){
                Collections.sort(mas);
                int sum =   mas.stream().mapToInt(Integer :: intValue).sum();
                ArrayList<Integer> l = new ArrayList<>();
                ArrayList<Integer> r = new ArrayList<>();
                int max = Collections.max(mas);
                int min = Collections.min(mas);
                if(sum == qi){
                    ans.add("Yes");
                } else{
                    int pivot = Math.floorDiv(max + min,2);
                    for(int j : mas){
                        if(j <= pivot) l.add(j);
                    }
                    for (int j : mas){
                        if(j > pivot) r.add(j);
                    }
                    if(l.size() != 0){

                    }
                }
            }
        }
    }
}
