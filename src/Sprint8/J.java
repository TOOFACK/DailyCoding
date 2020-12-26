package Sprint8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class J {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/home/pavel/input.txt"));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int amountG = Integer.parseInt(st.nextToken());
        int backPackMaxWeight = Integer.parseInt(st.nextToken());

        boolean[][] dp = new boolean[amountG + 1][backPackMaxWeight + 1];
        int[] gold = new int[amountG];
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i =0; i < amountG; i++){
            gold[i] = Integer.parseInt(st.nextToken());
        }


        dp[0][0] = true;

            for(int j = 1; j < backPackMaxWeight + 1; j++){
              dp[0][j] = false;
            }
            for(int i =1; i < amountG +1; i++){
                dp[i][0] = true;
            }

            for(int i = 1; i < amountG + 1; i++){
                for(int j = 1;j < backPackMaxWeight +1; j++){
                    if(j - gold[i-1] >=0 && dp[i - 1][j - gold[i - 1]]) {
                        dp[i][j] = true;
                    } else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            int maxIndex = -1;
            for(int i =0; i < backPackMaxWeight + 1; i++){
                if(dp[amountG][i]){
                    if(maxIndex < i){
                        maxIndex = i;
                    }
                }
            }
            out.print(maxIndex);
            out.flush();

    }
}
