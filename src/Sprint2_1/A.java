package Sprint2_1;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {

        try {
            new A().run();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    StreamTokenizer in;
    PrintWriter out;

    float nextFloat() throws IOException
    {
        in.nextToken();
        return (float)in.nval;
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
        int temp = nextInt();

        ArrayList<Float> start = new ArrayList<>();
        ArrayList<Float> end = new ArrayList<>();
        ArrayList<Float> endSorted = new ArrayList<>();

        for(int i = 0; i < temp; i++){
            float s = nextFloat();
            float e = nextFloat();
            start.add(s);
            end.add(e);
            endSorted.add(e);

        }


        ArrayList<Float> startSorted = new ArrayList<>();

        Collections.sort(endSorted);


//        for(Float s : endSorted){
//            System.out.println(s);
//        }

        for(int i =0; i < temp; i++){
//            System.out.println("End Sorted value = " + endSorted.get(i));
//            System.out.println("end index is " + end.indexOf(endSorted.get(i)));
//            System.out.println("start value is " + start.get(end.indexOf(endSorted.get(i))));
            startSorted.add(start.get(end.indexOf(endSorted.get(i))));
            start.remove(startSorted.get(i));
            end.remove(endSorted.get(i));

        }

        ArrayList<Float> startAns = new ArrayList<>();
        ArrayList<Float> endAns = new ArrayList<>();

        startAns.add(startSorted.get(0));
        endAns.add(endSorted.get(0));

        float minStart = startAns.get(0);
        for(int i = 1; i < temp; i++){

            if(endAns.get(0).equals(endSorted.get(i))){
                if(minStart > startSorted.get(i)){
                    minStart = startSorted.get(i);
                    startAns.remove(0);
                    startAns.add(0,minStart);
//                    System.out.println(startAns.get(0));
                }
            } else{
                break;
            }
        }



        int k = 0;
        minStart = 1000;
        for(int i = 1; i < temp; i++) {

            if (startSorted.get(i) >= endAns.get(k) && (!startSorted.get(i).equals(startAns.get(k)) && !endSorted.get(i).equals(endAns.get(k)))) {
                float ending = endSorted.get(i);
                int j = i;
                while (endSorted.get(j) == ending) {
                    if (startSorted.get(j) < minStart && startSorted.get(j) >= endAns.get(k)) {
                        minStart = startSorted.get(j);
                    }
                    j++;
                    if (j == endSorted.size()) {
                        break;
                    }
                }

                startAns.add(minStart);
                endAns.add(endSorted.get(i));
                minStart = 300;
                k++;
            }
        }

        out.println(endAns.size());

        for(int i = 0; i < startAns.size(); i++){
            out.print(startAns.get(i).toString().replaceAll("\\.?0*$", ""));
            out.print(" ");
            out.print(endAns.get(i).toString().replaceAll("\\.?0*$", ""));
            out.println();

        }
    }


}
