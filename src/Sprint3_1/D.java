    package Sprint3_1;



    import java.util.*;

    public class D {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int temp1 = in.nextInt();
            int temp2 = in.nextInt();
            int[] mas1 = new int[temp1];
            int[] mas2 = new int[temp2];
            for(int i =0; i < temp1; i++){
                mas1[i] = in.nextInt();
            }
            for(int i =0; i < temp2; i++){
                mas2[i] = in.nextInt();
            }

            if(temp2!= 0){
                quickSort(mas2, 0, temp2 - 1);
            }


            ArrayList<Integer> mas2N = new ArrayList<Integer>();
            for(int s : mas2) {
                mas2N.add(s);
            }
            LinkedHashSet<Integer> ans = new LinkedHashSet<>();
            for(int i = 0; i < temp1; i++){
                int index = Collections.binarySearch(mas2N,mas1[i]);
                if(index >= 0){
                    ans.add(mas2N.get(index));
            }
        }
            for(int s : ans){
                System.out.print(s + " ");
            }
        }

        private static void quickSort(int[] mas, int leftBorder, int rightBorder) {
            int left = leftBorder;
            int right =     rightBorder;
            int pivot = mas[(left + right) / 2];

            do{
                while(mas[left] < pivot){
                    left++;
                }
                while(mas[right] > pivot){
                    right--;
                }
                if(left <= right){
                    if(left < right){
                        int tmp = mas[left];
                        mas[left] = mas[right];
                        mas[right] = tmp;
                    }
                    left++;
                    right--;
                }
            } while(left <= right);

            if(left < rightBorder){
                quickSort(mas,left,rightBorder);
            }
            if(right > leftBorder){
                quickSort(mas,leftBorder,right);
            }
        }
    }

