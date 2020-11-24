package Sprint2_1;



import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class D {
    public static void main(String[] args) {
        new D().run();
    }

    StreamTokenizer in;
    PrintWriter out;


    int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
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
        int weightBackpack = nextInt();
        int amount = nextInt();


        ArrayList<Integer> weights = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();

        ArrayList<Integer> weightsSorted = new ArrayList<>();
        ArrayList<Integer> valuesSorted = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();


        for (int i = 0; i < amount; i++) {
            int v = nextInt();
            int w = nextInt();
            values.add(v);
            weights.add(w);
            valuesSorted.add(v);
            index.add(w);
        }
        Collections.sort(valuesSorted);
        Collections.reverse(valuesSorted);

        for (int i = 0; i < amount; i++) {
            weightsSorted.add(weights.get(values.indexOf(valuesSorted.get(i))));
            weights.remove(weightsSorted.get(i));
            values.remove(valuesSorted.get(i));
        }
//        for (int i = 0; i < amount; i++) {
//            System.out.println(valuesSorted.get(i) + " value " + weightsSorted.get(i) + " weight");
//        }

        while (valuesSorted.size() > 0) {
            int value = valuesSorted.get(0);
            int j = 0;
            int min = weightsSorted.get(0);
            while (value == valuesSorted.get(j)) {
//                System.out.println("value now is " + value + " valueget(j)= " + valuesSorted.get(j));
                if (min > weightsSorted.get(j)) {
//                    System.out.println(min + " > "  + weightsSorted.get(j));
                    min = weightsSorted.get(j);
                }
                j++;
                if(j >= valuesSorted.size())
                    break;
//                System.out.println("j = " + j);
            }

            if(weightBackpack - min >= 0){
            ans.add(index.indexOf(min));
            weightBackpack-=min;
            }

//            System.out.print(valuesSorted.get(j-1) + " values " );
//            System.out.println(min + " weight");
            valuesSorted.remove(valuesSorted.get(weightsSorted.indexOf(min)));
            weightsSorted.remove(weightsSorted.indexOf(min));
//
//            System.out.println("values");
//            for(int s : valuesSorted){
//                System.out.print(s + " ");
//            }
//            System.out.println();
//            System.out.println("weights");
//            for(int s : weightsSorted){
//                System.out.print(s + " ");
//            }

        }
        Collections.sort(ans);
    for(int s : ans){
        System.out.print(s +" ");
    }


    }
}
