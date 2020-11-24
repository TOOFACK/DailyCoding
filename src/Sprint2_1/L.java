package Sprint2_1;

import java.io.*;
import java.util.TreeMap;

public class L {
    public static void main(String[] args) {
        try {
            new L().run();
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
        int[] mas = new int[temp];
        for(int i = 0; i < temp; i++){
            mas[i] = nextInt();
        }
//        for(int i = 0; i < temp; i++){
//            System.out.print(mas[i] + " ");
//        }

        int stupen = mas[0];
        int maxStupen = 0;
        int index = 0;
        boolean trigger = false;
        int check = 0;
        int jumps = mas[0];
        int i = 1;
        if(stupen != 0) {
            for (int j = 0; j < temp; j++) {
//                System.out.println("Now on star " + j + " amonut of jump = " + mas[j]);
//                System.out.println("Searching max");
                i = j+1;
                do {
//                    System.out.println("Now on stair " + i + " amount of jumps = " + mas[i]);
                    if (mas[i] > maxStupen) {
//                        System.out.println(mas[i] + " > " + maxStupen);
                        maxStupen = mas[i];
                        index = i;
//                        System.out.println("maxStupen = " + mas[i]);
                    }

                    jumps--;
//                    System.out.println("jumps left " + jumps);
                    if(jumps == 0) break;


                    i++;
//                    System.out.println("i = " + i);
                    if(i == temp-1){
//                        System.out.println("DONE");
                        check = 1;
                        trigger = true;
                        break;
                    }

                } while (jumps > 0);
                jumps = maxStupen-1;
//                System.out.println("Find best stair: index is " + index + " and amount of jumps = " + maxStupen);

                j = index;
//                System.out.println("j = " + j);
                if(maxStupen == 0 && check == 0){
//                    System.out.println("Done2");
                    trigger = false;
                    break;
                } else if(check == 1){
                    break;
                }

                maxStupen = 0;
            }
        }
        if(trigger)
            out.print("True");
        else
            out.print("False");
    }

    private int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }
}
