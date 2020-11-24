package Sprint2_1;

import java.io.*;

public class H {

    public static void main(String[] args) {
        try {
            new H().run();
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
        int maxLen = 0;
        int lenMas = nextInt();
        int[] mas = new int[lenMas];
        for(int i = 0; i < lenMas; i++){
            mas[i] = nextInt();
        }

        int tempMaxLen = 0;

        for(int i =0; i < lenMas-1; i++){

            if(mas[i] < mas[i+1]) {
                tempMaxLen++;
//                System.out.println(mas[i] + " < " + mas[i + 1]);
//                System.out.println("tempMaxLen = " + tempMaxLen);
                if (tempMaxLen > maxLen) {
//                    System.out.println("tempMaxLen > maxLen");
//                    System.out.println(tempMaxLen + " > " + maxLen);
                    maxLen = tempMaxLen;
//                    System.out.println("maxLen = " + maxLen);

                }
            } else {tempMaxLen = 0;}

        }
        out.print(maxLen+1);
    }

    private int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

}
