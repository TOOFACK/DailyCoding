package Sprint2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> values = new ArrayList<>();
        int sum = 0;


        for(int i =0; i < n; i++){
            values.add(in.nextInt());
            sum += values.get(i);
        }

        Collections.sort(values);
        if(sum % k != 0){
            System.out.println("False");
        } else if(values.get(n-1) > sum/k){
            System.out.println("False");
        } else {
            System.out.println(check(k, n, values, sum/k));
        }


    }

    public static String check(int k, int n, ArrayList<Integer> values, int prize){
        for(int s : values){
            System.out.print(s + " ");
        }
        System.out.println();
        int tempSum = 0;
        int end = values.size()-1;
        int start = 0;
        System.out.println("end = " + end);
        System.out.println("start = " + start);
        while(tempSum != prize){
            tempSum+=values.get(end);
            if(tempSum == prize){
                values.remove(end);
                System.out.println("tSum = " + tempSum);
                for(int s : values){
                    System.out.print(s + " ");
                }
                System.out.println();
                System.out.println("end = " + end);
                System.out.println("start = " + start);
                return check(k,n,values,prize);
            } else{
                tempSum+=values.get(start);
                if(tempSum == prize){

                    values.remove(start);
                    values.remove(end);
                    System.out.println("tSum = " + tempSum);
                    for(int s : values){
                        System.out.print(s + " ");
                    }
                    System.out.println();
                    System.out.println("end = " + end);
                    System.out.println("start = " + start);
                    return check(k,n,values,prize);
                } else if(tempSum < prize){

                    values.remove(start);
                    values.remove(end);
                    end--;
                    start++;

                    for(int s : values){
                        System.out.print(s + " ");
                    }
                    System.out.println();
                    System.out.println("end = " + end);
                    System.out.println("start = " + start);
                    tempSum+=values.get(start);
                    System.out.println("tSum = " + tempSum);
                }
            }
            if(start == end){
                return "False";
            }
        }
        return "True";

    }
}
