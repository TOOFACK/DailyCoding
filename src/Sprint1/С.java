package Sprint1;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class С {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] ch = new int[n];

        for(int i =0; i< n; i++){
            ch[i] = in.nextInt();
        }
        int l = in.nextInt();
        int nCh = 0;



        for(int i =0; i< n; i++){
            nCh += (int) (ch[i] * Math.pow(10,n - i - 1));
        }

        nCh = nCh + l;
        int k = nCh;
        int j = 0;
        while(k > 0){
             k = k / 10;
             j++;
        }


        int[] ans = new int[j];


        for(int i = 0; i < j; i++){

            ans[i] = (int) (nCh / (Math.pow(10, j - i - 1)));


            nCh = (int) (nCh % (Math.pow(10, j - i - 1)));

        }
        for(int i = 0; i < j; i++){
            System.out.println(ans[i]);
        }
    }
}
