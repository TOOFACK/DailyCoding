package Sprint2_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class K {
    public static void main(String[] args) {
        try {
            new K().run();
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
        int temp = nextInt();
        int bank = nextInt();
        ArrayList<Integer> prices = new ArrayList<>();
        for(int i = 0; i < temp; i++){
            prices.add(nextInt());
        }
        Collections.sort(prices);
        int otv = 0;
        for(int i = 0; i < temp; i++){
            if(bank - prices.get(i) >= 0){
                otv++;
                bank -= prices.get(i);
            } else {
                break;
            }
        }
        out.print(otv);
    }

    private int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

}
