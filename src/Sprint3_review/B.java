package Sprint3_review;

import java.io.*;
import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class B {

    StreamTokenizer in;
    PrintWriter out;
    int nextInt() throws IOException
    {
        in.nextToken();
        return (int)in.nval;
    }

    private void run() {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
        try {
            solve();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.flush();
    }


    public static void main(String[] args) {
        new Sprint3_review.B().run();

    }


    private static double median(int[] mas1, int[] mas2, int n, int m) {

        int median = 0;

        int minIndex = 0;
        int maxIndex = n;
        int i =0;
        int j = 0;

        while (minIndex <= maxIndex){
             i = (minIndex + maxIndex) / 2;
             j = (n + m + 1)/2 - i;

            if(j > 0 && i < n && mas2[j-1] > mas1[i]){
                    minIndex = i +1;
            } else if(i > 0 && j < m && mas2[j] < mas1[i-1]){
                maxIndex = i -1;
            } else{
                if (i == 0)
                    median = mas2[j - 1];
                else if (j == 0)
                    median = mas1[i - 1];
                else
                    median = Math.max(mas1[i - 1],
                            mas2[j - 1]);
                break;
            }
        }

        if ((n + m) % 2 == 1)
            return median;

        if (i == n)
            return (median + mas2[j]) / 2.0;


        if (j == m)
            return (median + mas1[i]) / 2.0;

        return (median + Math.min(mas1[i],
                mas2[j])) / 2.0;
    }
    private void solve() throws IOException {
        int index1 = nextInt();
        int index2 = nextInt();

        int[] mas1 = new int[index1];
        int[] mas2 = new int[index2];

        for(int i =0; i < index1; i++){
            mas1[i] = nextInt();
        }
        for(int i =0; i < index2; i++){
            mas2[i] = nextInt();
        }


        int n = mas1.length;
        int m = mas2.length;
        String res = "";

        if (n < m)
            res = (String.valueOf(median(mas1,mas2,n, m)));
        else
            res = String.valueOf(median(mas2,mas1, m, n));
        String[] k = res.split("\\.");
        if(k[1].equals("0")){
            System.out.println(k[0]);
        } else{
            System.out.print(k[0] + "." + k[1]);
        }
    }
}
