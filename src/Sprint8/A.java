package Sprint8;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/home/pavel/input.txt"));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        long[] mas = new long[n+1];
        mas[0] = 1;
        mas[1] = 1;
        for(int i = 2; i < n+1; i++){
            mas[i] = (mas[i-1] + mas[i-2])%1000000007;
        }
//        System.out.println(Arrays.toString(mas));
        out.print(mas[n]);
        out.flush();

    }
}
