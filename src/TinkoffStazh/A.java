
package TinkoffStazh;
import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        in.nextToken();
        int a = (int) in.nval;
        in.nextToken();
        int b = (int) in.nval;
        in.nextToken();
        int c = (int) in.nval;
        in.nextToken();
        int d = (int) in.nval;

        if(d - b < 0){
            out.print(a);
        } else {
            int ans = a + (d - b) * c;
            out.print(ans);
        }
        out.flush();
    }
}
