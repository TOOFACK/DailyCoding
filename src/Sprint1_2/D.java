package Sprint1_2;

import java.io.*;
import java.util.ArrayList;

public class D {

    StreamTokenizer in;
    PrintWriter out;

    public static void main(String[] args) {

        try {
            new D().run();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    int nextInt() throws IOException
    {
        in.nextToken();
        return (int)in.nval;
    }


    private void run() throws IOException {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }

    private void solve() throws IOException {

        int str = nextInt();
        int col = nextInt();

        int[][] matrix = new int[str][col];

        for(int i = 0; i < str; i++){
            for(int j =0; j < col; j++){
                matrix[i][j] = nextInt();
            }
        }
//        for(int i = 0; i < str; i++){
//            for(int j =0; j < col; j++){
//                out.print(matrix[i][j]);
//                out.print(" ");
//            }
//            out.println();
//        }

        int fStr = nextInt();
        int fCol = nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        if(fStr + 1 < str && str !=0 && col != 0){
            list.add(matrix[fStr + 1][fCol]);
        }
        if(fStr - 1 >= 0&& str !=0 && col != 0){
            list.add(matrix[fStr-1][fCol]);
        }
        if(fCol + 1 < str&& str !=0 && col != 0){
            list.add(matrix[fStr][fCol+1]);
        }
        if(fCol - 1 >= 0&& str !=0 && col != 0){
            list.add(matrix[fStr][fCol-1]);
        }
        for(int s : list){
            out.print(s);
            out.print(" ");
        }

    }
}
