package TinkoffStazh;

import java.io.*;

public class B {


    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        in.nextToken();

        int a = (int) in.nval;
        out.print(ruletUtil(a));
        out.flush();

    }

   static int ruletUtil(int amount){
        if(amount == 1) return 0;
        if(amount == 2) return 1;
        if(amount == 3) return 2;
        if(amount % 2 == 0){
            return 1 + ruletUtil(amount/2);
        } else{
            return 1 + Math.max(ruletUtil(amount/2) ,ruletUtil(amount-amount/2));
        }
    }
}
