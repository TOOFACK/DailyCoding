package Sprint8;

import Sprint1.P;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class H {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/home/pavel/input.txt"));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int temp1 = Integer.parseInt(st.nextToken());
        int[] pos1 = new int[temp1];
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i = 0 ; i < temp1; i++){
            pos1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine(), " ");
        int temp2 = Integer.parseInt(st.nextToken());
        int[] pos2 = new int[temp2];
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i = 0 ; i < temp2; i++){
            pos2[i] = Integer.parseInt(st.nextToken());
        }

        int[][]dp = new int[temp1+1][temp2+1];
        for(int i = 0; i<  temp1+1; i++){
            for(int j = 0; j < temp2+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i = 1; i<  temp1+1; i++){
            for(int j = 1; j < temp2+1; j++) {
             if(pos1[i-1] == pos2[j-1]){
                 dp[i][j] = dp[i-1][j-1] + 1;
             } else{
                 dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
             }

            }
        }
        int max = dp[temp1][temp2];
//        System.out.println(Arrays.toString(pos1));
//        System.out.println(Arrays.toString(pos2));
//        System.out.println(Arrays.deepToString(dp));
//        System.out.println(dp[temp1][temp2]);

        int[] index1 = new int[max];
        int[] index2 = new int[max];
       int n =max-1;
       int i = temp1;
       int j = temp2;
       while(n >= 0){
//           System.out.println("i = " + i);
//           System.out.println("j = "+  j);

           if(pos1[i-1]==pos2[j-1]){
//               System.out.println("found");
               index1[n] = i;
               index2[n] = j;
               n--;
               i--;
               j--;
           } else{
               if(dp[i][j] <= dp[i][j-1]){
                   j--;
               } else{
                   i--;
               }
           }
//           System.out.println(Arrays.toString(index1));
//           System.out.println(Arrays.toString(index2));
       }



        out.println(max);
//        System.out.println(Arrays.toString(index1));
//        System.out.println(Arrays.toString(index2));

        for(int h : index1){
            out.print(h);
            out.print(" ");
        }
        out.println();

        for(int g : index2){
            out.print(g);
            out.print(" ");
        }
        out.flush();
    }
}
