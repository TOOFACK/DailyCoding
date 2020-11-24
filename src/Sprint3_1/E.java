package Sprint3_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp1 = in.nextInt();
        int temp2 = in.nextInt();

        int[] mas1 = new int[temp1];
        int[] mas2 = new int[temp2];

        for (int i =0; i < temp1; i++){
            mas1[i] = in.nextInt();
        }
        for(int i = 0; i < temp2; i++){
            mas2[i] = in.nextInt();
        }
        if(temp2 != 0) {
            quicksort(mas2, 0, temp2 - 1);
        }
        ArrayList<Integer> newMas2 = new ArrayList<>();
        for(int s : mas2){
            newMas2.add(s);
        }
        for(int i = 0; i < temp1; i++){
            int index = Collections.binarySearch(newMas2,mas1[i]);
            if(index >=0) {
                System.out.print(newMas2.get(index) + " ");
                newMas2.remove(index);
            }


        }


    }

    private static void quicksort(int[] mas, int leftBorder, int rightBorder) {
        int right = rightBorder;
        int left = leftBorder;
        int pivot = mas[(right + left) /2];
do {
    while (mas[right] > pivot) {
        right--;
    }
    while (mas[left] < pivot) {
        left++;
    }
    if (left <= right) {
        if (left < right) {
            int tmp = mas[left];
            mas[left] = mas[right];
            mas[right] = tmp;
        }
        right--;
        left++;
    }
}
        while(left <= right);

        if(left < rightBorder){
            quicksort(mas,left,rightBorder);
        }
        if(right > leftBorder){
            quicksort(mas,leftBorder, right);
        }

    }
}
