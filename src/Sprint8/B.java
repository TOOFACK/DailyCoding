package Sprint8;

import java.io.*;

import java.util.StringTokenizer;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/home/pavel/input.txt"));
        StringTokenizer line1 = new StringTokenizer(bf.readLine(), " ");
        StringTokenizer line2 = new StringTokenizer(bf.readLine(), " ");
        StringTokenizer line3 = new StringTokenizer(bf.readLine(), " ");
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(line1.nextToken());
        int temp = Integer.parseInt(line2.nextToken());
        int[] coins = new int[temp];
        int[] dp = new int[n+1];
        for(int i =0; i < temp; i++){
            coins[i] = Integer.parseInt(line3.nextToken());
        }

        int min = Integer.MAX_VALUE - 1;

        for(int i =1; i < n+1; i++){
            for(int c : coins){
                int t = 0;
                if(i - c < 0){
                    t = Integer.MAX_VALUE;
                } else{
                    t = dp[i-c]+1;
                }
                if(min > t){
                    min = t;
                }
            }
            dp[i] = min;
            min = Integer.MAX_VALUE - 1;
        }
        out.print(dp[n] == Integer.MAX_VALUE - 1 ? -1 : dp[n]);
        out.flush();
    }
}
