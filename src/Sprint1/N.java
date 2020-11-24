package Sprint1;

import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();

        boolean tr = false;
        if(val ==1)
            tr = true;

            while(val > 0){
            if(val % 2 != 0){
                break;
            } else{
                tr = true;
            }
            val /=2;
        }
        if(tr) {
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
