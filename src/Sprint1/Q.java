package Sprint1;

import java.util.Arrays;
import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int temp = in.nextInt();

         int[] mas = new int[temp];
         int maxProduct = -1;

        Arrays.sort(mas);

         for(int i = 0; i <mas.length; i++){
             mas[i] = in.nextInt();
         }
         for(int i = 0; i < mas.length; i++){

             for(int j = 0; j < mas.length; j++){

                 int left = i+1;
                 int right = mas.length - 1;
                 if(left == mas.length || right == mas.length)
                     break;

                 if(mas[i] + mas[left] + mas[right] == 0){
                     if(maxProduct < mas[i] * mas[right]*mas[left]) {
                         maxProduct = mas[i] * mas[right] * mas[left];
                     }
                     right++;
                     left--;

                 } else if(mas[i] + mas[left] + mas[right] > 0){
                     right--;
                 }else{
                     left++;
                 }

             }
         }
        System.out.println(maxProduct);
    }
}
