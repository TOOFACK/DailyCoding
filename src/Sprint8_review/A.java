package Sprint8_review;

import java.util.ArrayDeque;
import java.util.Scanner;

public class A {
    static int inf = 1000000;
    static int dp[][];
    static int a[];


    static int DP(int i, int j) {
        if (j > i) return inf;
        else {
            int res;
            int cost = a[i];
            if (j <= 0) {
                if (i >= 1) {
                    if (cost <= 500) {
                        int dif = Math.min(DP(i - 1, j + 1), DP(i - 1, j) + cost);
                        res = dif;
                    } else {
                        return DP(i - 1, j + 1);
                    }
                } else return 0;
            } else {
                if (dp[i][j] != -1) return dp[i][j];
                int dif;
                if (cost > 500) {
                    dif = Math.min(DP(i - 1, j + 1), DP(i - 1, j - 1) + cost);
                } else {
                    dif = Math.min(DP(i - 1, j + 1), DP(i - 1, j) + cost);
                }
                res = dif;
            }
            dp[i][j] = res;
            return res;
        }
    }


    static void DP_Utils(ArrayDeque<Integer> used, int i, int j) {
        if (j < i) {
            int cost = a[i];
            if (j <= 0) {
                if (i >= 1) {
                    if (cost > 500) {
                        used.add(i);
                        DP_Utils(used, i - 1, j + 1);
                    } else {
                        boolean addi = (DP(i, j) == DP(i - 1, j + 1));
                        if (addi) {
                            used.add(i);
                            DP_Utils(used, i - 1, j + 1);
                        } else DP_Utils(used, i - 1, j);
                    }
                }
            } else {
                boolean addi = (DP(i - 1, j + 1) == DP(i, j));
                if (cost <= 500) {
                    if (addi) {
                        used.add(i);
                        DP_Utils(used, i - 1, j + 1);
                    } else {
                        DP_Utils(used, i - 1, j);
                    }
                } else {
                    if (addi) {
                        used.add(i);
                        DP_Utils(used, i - 1, j + 1);
                    } else {
                        DP_Utils(used, i - 1, j - 1);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k1 = 0;
        int k2 = 0;
        a = new int[n + 1];
        for (int i = 1; i <= n; i++) a[i] = scanner.nextInt();
        dp = new int[n + 1][n + 2];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n + 1; j++)
                dp[i][j] = -1;
        }

        int ans = inf;

        for (int i = 0; i <= n; i++) {
            if (ans >= DP(n, i)) {
                ans = DP(n, i);
                k1 = i;
            }
        }

        System.out.print(ans + " ");

        ArrayDeque<Integer> used = new ArrayDeque<>();

        DP_Utils(used, n, k1);

        k2 = used.size();

        System.out.println(k2);

        while (!used.isEmpty()) {
            System.out.print(used.removeLast() + " ");
        }
    }
}