package Sprint8;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/home/pavel/input.txt"));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        PrintWriter out = new PrintWriter(System.out);

        int[] dp = new int[n+1];
        int[] jumps = new int[k];
        for(int i =0; i < k; i++){
            jumps[i] = i + 1;
        }
        dp[1] = 1;

        for(int i = 2; i < n + 1; i++){
            for (int j : jumps){
                if(i - j >= 0){
                    dp[i]= (dp[i] + dp[i-j]) % 1000000007;
                }
            }
        }

//        System.out.println(Arrays.toString(dp));
        out.print(dp[n]%1000000007);
        out.flush();

    }
}
