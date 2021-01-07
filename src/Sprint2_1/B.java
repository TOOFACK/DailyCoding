package Sprint2_1;

import java.io.*;

public class B {
    public static void main(String[] args) {
        new B().run();
    }



    StreamTokenizer in;
    PrintWriter out;


    int nextInt() throws IOException
    {
        in.nextToken();
        return (int)in.nval;
    }

    private void run() {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
        try {
            solve();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.flush();
    }

    private void solve() throws IOException {
        int temp = nextInt();
        int[] mas = new int[temp];

        for(int i = 0; i < temp; i++){
            mas[i] = nextInt();
        }

        int k = 0;
        int sum = 0;

        for(int i =0 ; i < temp-1; i++) {
            int income = 0;
            if (mas[i] < mas[i + 1]) {
//                System.out.println(mas[i] + " < " + mas[i+1]);
                k = i;
                while (k < temp-1) {

                    if (mas[k] < mas[k + 1]) {
//                        System.out.println(mas[k] + " < " + mas[k+1]);

                        income = mas[k+1] - mas[i];
//                        System.out.println("income = " + mas[k+1] + " - " + mas[i] +" = " + income);
                        k++;
                    } else{

                        break;
                    }
                }
                i = k;
            }
//            System.out.println("iteration i = " + i);
            sum += income;
//            System.out.println(sum);
        }
        out.println(sum);

    }

}
