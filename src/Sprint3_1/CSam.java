package Sprint3_1;

import java.util.Arrays;
import java.util.Scanner;

public class CSam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        int[] mas = new int[temp];
        for(int i =0; i < mas.length; i++){
            mas[i] = in.nextInt();
        }
        quickSort(mas, 0, temp-1);
        System.out.println((Arrays.toString(Arrays.stream(mas).toArray())) .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim());
    }

    private static void quickSort(int[] mas, int leftBorder, int rightBorder) {
        int left = leftBorder;
        int right = rightBorder;
        int pivot = mas[(left + right) / 2];
do {
    while (mas[left] < pivot) {
        left++;
    }

    while (mas[right] > pivot) {
        right--;
    }
    if (left <= right) {
        if (left < right) {
            int tmp = mas[left];
            mas[left] = mas[right];
            mas[right] = tmp;
        }

    }
    left++;
    right--;
} while (left <= right);

if(left < rightBorder){
    quickSort(mas, left, rightBorder);
}
if(right > leftBorder){
    quickSort(mas,leftBorder,right);
}
}
}
