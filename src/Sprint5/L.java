package Sprint5;

import java.io.*;
import java.util.*;

public class L {
    public static void main(String[] args) throws IOException {

        new L().run();
    }

    StreamTokenizer in;
    PrintWriter out;



    long nextInt() throws IOException
    {
        in.nextToken();
        return (long)in.nval;
    }

    void run() throws IOException
    {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }





    private   void solve() throws IOException {

        long len = nextInt();
        long sumFinal = nextInt();
        long[] mas = new long[(int) len];
        for (int i = 0; i < len; i++) {
            mas[i] = nextInt();

        }


        HashMap<Long, ArrayList<ArrayList<Long>>> sumOfVals = new HashMap<>();
        HashMap<Long, Long> count = new HashMap<>();

        for(long t : mas){
            if(count.containsKey(t)){
                long amount = count.get(t);
                amount++;
                count.put(t,amount);
            } else{
                count.put(t,1L);
            }
        }


        for (int a = 0; a < len; a++) {
            for (int b = 0; b < len; b++) {
                if (a != b) {
                    ArrayList<Long> tempArray = new ArrayList<>();
                    ArrayList<ArrayList<Long>> tempArrayArrays = new ArrayList<>();
                    long sum = mas[a] + mas[b];
                    tempArray.add(mas[a]);
                    tempArray.add(mas[b]);



                    if (sumOfVals.containsKey(sum)) {
                        tempArrayArrays = sumOfVals.get(sum);
                    }

                    tempArrayArrays.add(tempArray);
                    sumOfVals.put(sum, tempArrayArrays);
//                    System.out.println("sum = " + sum);
//                    System.out.print("Sequence = ");
//                    for (int t : tempArray) {
//                        System.out.print(t + " ");
//                    }
//                    System.out.println();


//                    System.out.println("keys");
//                    System.out.println(sumOfVals.keySet().toString());
//                    System.out.println("vals");
//                    System.out.println(sumOfVals.values().toString());
                }
            }
        }


            ArrayList<Long> ansTemp = new ArrayList<>();
            ArrayList<ArrayList<Long>> ans = new ArrayList<>();
        HashMap<Long, Long> count2 = new HashMap<>();

            for (int c = 0; c < len; c++) {
                for (int d = 0; d < len; d++) {
                    if (c != d) {
                        long sum = -mas[c] - mas[d] + sumFinal;


                        if (sumOfVals.containsKey(sum)) {
                            ArrayList<ArrayList<Long>> secSubSeq = sumOfVals.get(sum);
                            for (ArrayList<Long> integers : secSubSeq) {
                                ansTemp.add(mas[c]);
                                ansTemp.add(mas[d]);
                                ansTemp.add(integers.get(0));
                                ansTemp.add(integers.get(1));
                                Collections.sort(ansTemp);
//                                System.out.println("Fourth Seq");
//                                System.out.println(ansTemp.toString());

                                ArrayList<Long> tr = new ArrayList<>(ansTemp);

                                for(long t : tr){
                                    if(count2.containsKey(t)){
                                        long chet = count2.get(t);
                                        chet++;
                                        count2.put(t,chet);
                                    }
                                    else count2.put(t,1L);
                                }

                                boolean vseOk = true;
                                for(long t : tr){
                                    if(count.get(t)  < (count2.get(t))){
                                        vseOk = false;
                                        break;
                                    }
                                }

//                                System.out.println("cont1");
//                                System.out.println("keys");
//                                System.out.println(count.keySet().toString());
//                                System.out.println("vals");
//                                System.out.println(count.values().toString());
//                                System.out.println("cont2");
//                                System.out.println("keys");
//                                System.out.println(count2.keySet().toString());
//                                System.out.println("vals");
//                                System.out.println(count2.values().toString());

                                if(vseOk) {
//                                    System.out.println("VseOK");
                                    ans.add(tr);
                                }
                                ansTemp.clear();
                                count2.clear();
                            }


                        }


                    }
                }
            }




        HashSet<ArrayList<Long>> finalAns = new HashSet<>(ans);
        ArrayList<ArrayList<Long>> anseres;
        anseres = new ArrayList<>(finalAns);

        Collections.sort(anseres, (o1, o2) -> {
            for (int i = 0; i < o1.size(); i++) {
                if (o1.get(i) < o2.get(i)) {
                    return -1;
                } else if (o1.get(i) > o2.get(i)) {
                    return 1;
                }
            }
            return 0;
        });

        System.out.println(anseres.size());
       for(ArrayList<Long> l : anseres){
           for(long y : l){
               System.out.print(y + " ");
           }
           System.out.println();
       }


        }

    }





