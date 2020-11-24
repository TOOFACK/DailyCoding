package Sprint1_2;

import java.io.*;
import java.util.Scanner;

public class B {

    StreamTokenizer in;
    PrintWriter out;

    public static void main(String[] args) {

        try {
            new B().run();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    int nextInt() throws IOException
    {
        in.nextToken();
        return (int)in.nval;
    }

    void run() throws IOException
    {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }

    private void solve() throws IOException {

        int a = nextInt();
        int b = nextInt();

        int[][] matrix = new int[a][b];

        for(int i = 0; i < a; i++){
            for(int j =0; j < b; j++){
                matrix[i][j] = nextInt();
            }
        }

//        for(int i = 0; i < a; i++){
//            for(int j =0; j < b; j++){
//                out.print(matrix[i][j] + " ");
//            }
//            out.println();
//        }

        for(int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                out.print(matrix[j][i] + " ");
//                out.print("Строка = " + j + " " +  "Столбец = " + i);
            }
            out.println();
        }





    }


}


