package Sprint7;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class H {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String[] v = reader.readLine().split(" ");

        int vertex = Integer.parseInt(v[0]);
        int edge = Integer.parseInt(v[1]);

        Map<Integer, Set<Integer>> matrix = new HashMap<>();

        for (int i = 0; i < edge; i++) {
            v = reader.readLine().split(" ");
            int v1 = Integer.parseInt(v[0]);
            int v2 = Integer.parseInt(v[1]);


                if (!matrix.containsKey(v1)) {
                    Set<Integer> t = new HashSet<>();
                    t.add(v2);
                    matrix.put(v1, t);
                } else {
                    Set<Integer> t = matrix.get(v1);
                    t.add(v2);
                    matrix.put(v1, t);
                }

                if (!matrix.containsKey(v2)) {
                    Set<Integer> t = new HashSet<>();
                    t.add(v1);
                    matrix.put(v2, t);
                } else {
                    Set<Integer> t = matrix.get(v2);
                    t.add(v1);
                    matrix.put(v2, t);
                }

        }

        boolean vseOk = true;
        for(Set<Integer> t : matrix.values()){
            if(t.size() <= vertex){
                vseOk = false;
                break;
            }
        }

        System.out.println(vseOk ? "YES" : "NO");




    }
}
