package Sprint8;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class F {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/home/pavel/input.txt"));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int mas[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            String line = bf.readLine();
            for (int j = 0; j < line.length(); j++) {
                mas[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
            }
        }


        int[][] dp = new int[n][m];


        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {

                if (i == n - 1 && j == 0) {
                    dp[n - 1][0] = mas[n - 1][0];

                } else if (i == n - 1) {
                    dp[i][j] = mas[i][j] + dp[n - 1][j - 1];
                } else if (j == 0) {
                    dp[i][j] = mas[i][j] + dp[i + 1][j];
                } else {
                    dp[i][j] = mas[i][j] + Math.max(dp[i + 1][j], dp[i][j - 1]);
                }


            }
        }
        ArrayList<String> ans = new ArrayList<>();

        int i = 0;
        int j = m - 1;
        while (i != n - 1 || j != 0) {
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
            if (j == 0) {
                ans.add("U");
                i++;
            } else if (i == n - 1) {
                ans.add("R");
                j--;
            } else {
                if (dp[i + 1][j] > dp[i][j - 1]) {
                    i++;
                    ans.add("U");
                } else {
                    j--;
                    ans.add("R");
                }
            }


        }

        Collections.reverse(ans);
        System.out.println(dp[0][m-1]);
        for(String s : ans){
            System.out.print(s);
        }
    }


}





