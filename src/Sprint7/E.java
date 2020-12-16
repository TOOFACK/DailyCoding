package Sprint7;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class E {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new FileReader("/home/pavel/input.txt"),15000);
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        boolean isStrong = true;
        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        for(int i = 0; i < edge; i++){
            st = new StringTokenizer(bf.readLine(), " ");

            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            if(v1 != v2) {
                ArrayList<Integer> t;
                if (!graph.containsKey(v1)) {
                    t = new ArrayList<>();
                } else {
                    t = graph.get(v1);
                }
                t.add(v2);
                graph.put(v1, t);

            }
        }

        int amountStock = 0;
        int amountIstok = 0;
        boolean[] masIstock = new boolean[vertex+1];
        for(int i : graph.keySet()){
            ArrayList<Integer> list = graph.get(i);
             if(list.size() == 0){
                amountStock++;
             } else{
                 for(int j : list){
                     if(!masIstock[j])//think about it
                     masIstock[j] = true;
                 }
             }
        }

        for(boolean i : masIstock){
            if(!i){
                amountIstok++;
            }
        }

        if(vertex > 1){
            if(amountIstok > 0 || amountStock > 0){
                isStrong = false;
            }
        }
        if(isStrong){

        }






    }
}
