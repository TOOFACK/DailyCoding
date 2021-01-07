package Sprint8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class L {
    static  int[][] dp;

    public L(int i, int j) {
        dp = new int[i][j];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/home/pavel/input.txt"));
        PrintWriter out = new PrintWriter(System.out);
        String line = bf.readLine();
         L l =  new L(line.length()+1,line.length()+  1);

        for(int i = line.length()-1; i>=1; i--){
            for(int j = 1;j < line.length() + 1;j++){
                if(line.charAt(i-1) == line.charAt(j-1)){
                    dp[i][j] = dp[i+1][j-1];
                } else{
                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j-1]) + 1;
                }

            }
        }

        System.out.println(Arrays.deepToString(dp));
        out.println(dp[1][line.length()]);
         out.println(helper(1, line.length(), line));
        out.flush();

    }

    private static String helper(int i, int j, String line) {
        if(dp[i][j] == 0){
            return line.substring(i-1,j);
        } else if(line.charAt(i-1) == line.charAt(j-1)){
            return line.charAt(i-1) + helper(i + 1, j-1, line) + line.charAt(i-1);
        }
        else if(dp[i+1][j] > dp[i][j-1]){
            return line.charAt(j-1) + helper(i, j-1, line) + line.charAt(i-1);
        } else{
            return line.charAt(i-1) + helper(i+1, j,line) + line.charAt(j-1);
        }

    }
}
