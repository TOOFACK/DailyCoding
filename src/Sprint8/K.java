package Sprint8;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class K {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int amount = (int) in.nval;
        in.nextToken();
        int backPackWeight = (int) in.nval;

        int v[] = new int[amount];
        int w[] = new int[amount];

        for (int i = 0; i < amount; i++) {
             in.nextToken();
            w[i] = (int) in.nval;
            in.nextToken();
            v[i] = (int) in.nval;
        }

        int[][] dp = new int[amount + 1][backPackWeight + 1];

        dp[0][0] = 0;

        for (int j = 1; j < backPackWeight + 1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < amount + 1; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i < amount + 1; i++) {
            for (int j = 1; j < backPackWeight + 1; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j - w[i - 1] >= 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - w[i - 1]] + v[i - 1]);
                }
            }
        }
        int max = Arrays.stream(dp[amount]).max().getAsInt();

        int index = 0;
        for (int i = 0; i < backPackWeight + 1; i++) {
            if (max == dp[amount][i]) {
                index = i;
                break;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int i = amount;
        int j = index;
        while (max > 0) {


            if (j >= w[i - 1]) {
                if (dp[i - 1][j] < dp[i - 1][j - w[i - 1]] + v[i - 1]) {

                    ans.add(i);

                    max -= v[i - 1];

                    j = j - w[i - 1];
                    i--;



                }
            } else {

                i--;
                ans.add(i);
                max -= v[i - 1];
            }
        }


        out.println(ans.size());
        for(int g : ans){
            out.print(g + " ");
        }
        out.flush();
    }
}
