package Sprint2_1;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class E {
    public static void main(String[] args) {
        new E().run();
    }

    StreamTokenizer in;
    PrintWriter out;

    private void run() {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
        try {
            solve();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    int nextInt() throws IOException
    {
        in.nextToken();
        return (int)in.nval;
    }

    private void solve() throws IOException {
        int amountChildren = nextInt();
        int[] greedyChild = new int[amountChildren];

        for(int i = 0; i < amountChildren; i++){
            greedyChild[i] = nextInt();
        }
        Arrays.sort(greedyChild);

        int amountCookies = nextInt();
        int[] sizeOfCookie = new int[amountCookies];
        for(int i = 0; i < amountCookies; i++){
            sizeOfCookie[i] = nextInt();
        }
        Arrays.sort(sizeOfCookie);

        int k = 0;
        int ans = 0;

        if(amountChildren != 0 && amountCookies !=0) {
            for (int i = 0; i < amountCookies; i++) {
                if (sizeOfCookie[i] >= greedyChild[k]) {
                    ans += 1;
                    k++;
                }
                if (k == greedyChild.length) break;
            }
            out.print(ans);
            out.flush();
        } else{
            out.print(0);
            out.flush();
        }









    }


}
