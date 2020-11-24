package Sprint3_1;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        int[] mas = new int[temp];
        for(int i =0; i < temp; i++){
            mas[i] = in.nextInt();
        }
        boolean findingFirstChet = false;
        boolean findingFirstNehet = false;
        int index = 0;
        for(int i = 0; i < temp; i++){

            if(i % 2 == 0 && mas[i] % 2 != 0){
                if(!findingFirstChet && !findingFirstNehet) {
                    findingFirstChet = true;
                    index = i;
//                    System.out.println("Wrong place for nechet value = " + mas[i] + " index= " + i);
                }

            }else if(i % 2 != 0 && mas[i] % 2 ==0) {
                if(!findingFirstNehet && !findingFirstChet) {
                    findingFirstNehet = true;
                    index = i;
//                    System.out.println("Wrong place for chet value = " + mas[i] + " index= " + i);
                }

            }

             if(findingFirstChet && mas[i] % 2 == 0 &&  i != index){
//                 System.out.println("Find first Chet = " + mas[i] + " index = " + i);
                 int j = i;
//                 System.out.println("Start swapping elements");
                 while(j != index){
                     int tmp = mas[j];
                     mas[j] = mas[j-1];
                     mas[j-1] = tmp;
                     j--;
//                     for(int s : mas){
//                         System.out.print(s + " ");
//                     }
//                     System.out.println();
                 }
                 i = index;
                 findingFirstChet = false;
//                 System.out.print("Start loop for from index = " + i);
             }
             if(findingFirstNehet  && mas[i] % 2 != 0 && i != index){
//                 System.out.println("Find first Nechet = " + mas[i] + " index = " + i);
                 int j = i;
//                 System.out.println("Start swapping elements");
                 while(j != index){
                     int tmp = mas[j];
                     mas[j] = mas[j-1];
                     mas[j-1] = tmp;
                     j--;
//                     for(int s : mas){
//                         System.out.print(s + " ");
//                     }
//                     System.out.println();
                 }
                 findingFirstNehet = false;
                 i = index;
//                 System.out.println("Start loop for from index = " + i);
             }
        }
//        System.out.println();
        for(int s : mas){
            System.out.print(s + " ");
        }

    }
}
