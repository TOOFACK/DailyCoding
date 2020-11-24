package Sprint3_1;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        int[] mas = new int[temp];

        for(int i =0; i < temp; i++){
            mas[i] = in.nextInt();
        }

        quicksort(mas,0,temp-1);
        int max = mas[temp-1];
        int sum = 0;
        for(int i = temp-2; i > 0; i-- ){
            if(mas[i] + mas[i-1] > max){
                sum = mas[i] + mas[i-1] + max;

                break;
            } else
                max = mas[i];
        }
        System.out.println(sum);
    }

    private static void quicksort(int[] mas, int leftBorder, int rightBorder) {

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = mas[(leftBorder + rightBorder) / 2];
do {
    while (mas[leftMarker] < pivot) {
        leftMarker++;
    }

    while (mas[rightMarker] > pivot) {
        rightMarker--;
    }

    if (rightMarker >= leftMarker) {
        if (rightMarker > leftMarker) {
            int tmp = mas[leftMarker];
            mas[leftMarker] = mas[rightMarker];
            mas[rightMarker] = tmp;
        }
        leftMarker++;
        rightMarker--;
    }
}
        while(leftMarker <= rightMarker);
        if(leftMarker < rightBorder){
            quicksort(mas,leftMarker,rightBorder);
        }
        if(rightMarker > leftBorder){
            quicksort(mas, leftBorder, rightMarker);
        }
    }
}
