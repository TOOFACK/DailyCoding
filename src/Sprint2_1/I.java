package Sprint2_1;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class I {
    public static void main(String[] args) throws IOException {
        new I().run();
    }

    private void run() throws IOException {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out =  new PrintWriter(System.out);
        solve();
        out.flush();
    }

    private void solve() throws IOException {
        int temp = nextInt();
        int[] mas = new int[temp];
        int sum = 0;
        for(int i =0; i < temp; i++){
            mas[i] = nextInt();
            sum+=mas[i];
        }
//        System.out.println(Math.floor((float)sum/2)+1);
//
//        boolean dp[][] = new boolean[sum/2+1][mas.length+ 1];
//
//        for (int i = 0; i < mas.length + 1; i++){
//            dp[0][i] = true;
//        }
//        for(int i = 1; i < sum/2+1; i++){
//            dp[i][0] = false;
//        }
//
//        for(int i =1; i < sum/2; i++){
//            for(int j = 1; j < mas.length; j++){
//                    if(i - mas[j-1] >= 0 ){
//                        dp[i][j] = dp[i][j-1] || dp[i -mas[j-1]][j-1];
//                    } else
//                        dp[i][j] = dp[i][j-1];
//            }
//        }

//        for(int i =0; i < sum/2+1; i++){
//            for(int j = 0; j < mas.length + 1; j++) {
//                if(dp[i][j]){
//                    System.out.print("True ");
//                } else{
//                    System.out.print("False ");
//                }
//            }
//            System.out.println();

//            }


        if(karmarkarKarpPartition(mas) == 0){
            out.print("True") ;
        } else{
            out.print("False");
        }

    }

    private int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }
    int karmarkarKarpPartition(int[] baseArr) {
        // create max heap
        PriorityQueue<Integer> heap=new PriorityQueue<Integer>(baseArr.length, Comparator.reverseOrder());

        for (int value : baseArr) {
            heap.add(value);
        }
        for (int value : heap) {
            System.out.println(value);
        }
        System.out.println();

        while(heap.size() > 1) {
            int val1=heap.poll();
            int val2=heap.poll();
            int val = val1 - val2;
            heap.add(val);
            for (int value : heap) {
                System.out.println(value);
            };
            System.out.println();
        }

        return heap.poll();
    }

    StreamTokenizer in;
    PrintWriter out;
}
