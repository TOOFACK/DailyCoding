//package TinkoffStazh;

import java.io.*;

public class C {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        in.nextToken();
        int temp = (int) in.nval;
        int mas[] = new int[temp];
        in.nextToken();
        int t = (int) in.nval;
        for (int i = 0; i < temp; i++) {
            in.nextToken();
            mas[i] = (int) in.nval;
        }
        in.nextToken();
        int index = (int) in.nval;
        int ans = 0;
//        System.out.println(mas[index-1] + " " + t);
        if (mas[index - 1]- mas[0] <= t || mas[mas.length - 1] - mas[index - 1] <= t) {
//            System.out.println("TRUE");
            ans = mas[mas.length - 1] - mas[0];
        } else {
            int up = 0;
            int down = 0;
            for (int i = index - 1; i < mas.length-1; i++) {
                up += mas[i + 1] - mas[i];
            }
            for (int i = 0; i < index-1; i++) {
                down += mas[i + 1] -mas[i];
            }
            if(down < up){
                ans = 2 * down + up;
            } else{
                ans = 2 * up + down;
            }
        }
        out.print(ans);
        out.flush();
    }
}
