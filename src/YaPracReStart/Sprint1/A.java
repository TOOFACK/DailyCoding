package YaPracReStart.Sprint1;

import Sprint1.P;

import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);

        st.nextToken();
        int a = (int) st.nval;
        st.nextToken();
        int x = (int) st.nval;
        st.nextToken();
        int b = (int) st.nval;
        st.nextToken();
        int c = (int) st.nval;

        int ans = (int) (a*Math.pow(x,2) + b*x + c);
        out.print(ans);
        out.flush();

    }
}
