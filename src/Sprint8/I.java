package Sprint8;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class I {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/home/pavel/input.txt"));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(bf.readLine(), "\n");

        String lin1 = st.nextToken();
          st = new StringTokenizer(bf.readLine(), "\n");
        String lin2 = st.nextToken();


        String pos1[] = lin1.split("");
        String pos2[] = lin2.split("");


        int[][]dp = new int[lin1.length()+1][lin2.length()+1];
        for(int i = 0; i<  lin1.length()+1; i++){
            for(int j = 0; j < lin2.length()+1; j++){
               if(i == 0 && j == 0){
                   dp[i][j] = 0;
               } else if(j == 0){
                   dp[i][j] = i;
               } else if( i== 0){
                   dp[i][j] = j;
               }

            }
        }

        for(int i =1; i < lin1.length()+1; i++){
            for (int j =1; j < lin2.length()+1; j++){
                if(pos1[i - 1].equals(pos2[j - 1])){
                   dp[i][j] =  Math.min(dp[i-1][j] + 1, Math.min(dp[i][j-1] + 1, dp[i-1][j-1]));
                } else{
                    dp[i][j] =  Math.min(dp[i-1][j] + 1, Math.min(dp[i][j-1] + 1, dp[i-1][j-1] + 1));
                }
            }
        }



        int max = dp[lin1.length()][lin2.length()];
//        System.out.println(Arrays.deepToString(dp));


        out.println(max);
        out.flush();

    }
}
