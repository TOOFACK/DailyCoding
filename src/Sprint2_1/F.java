package Sprint2_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F {
    public static void main(String[] args) {
        try {
            new F().run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    StreamTokenizer in;
    PrintWriter out;

    private void run() throws IOException {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }

    private void solve() throws IOException {
        int amountOfDeleting = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int amountStrs = nexInt();
        int lenOfSrt = nexInt();
        try {


            String[][] strs = new String[amountStrs][lenOfSrt];
            for (int i = 0; i < amountStrs; i++) {
                strs[i] = br.readLine().split("");

            }


            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < lenOfSrt; j++) {
                for (int i = 0; i < amountStrs; i++) {
                    list.add(strs[i][j]);
                }

                if (!(list.stream().sorted().collect(Collectors.toList()).equals(list))) {
                    amountOfDeleting++;
                }
                list.clear();
            }
            out.print(amountOfDeleting);


        } catch (NullPointerException e) {

        }
    }

    private int nexInt() throws IOException {
        in.nextToken();
        return (int)in.nval;
    }
}
