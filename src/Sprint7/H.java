package Sprint7;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class H {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/pavel/input.txt"));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        Map<Integer, Set<Integer>> matrix = new HashMap<>();

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(reader.readLine(), " ");

            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            if (v1 != v2) {
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
        }
        for(int i = 1; i < vertex + 1; i++){
            if(!matrix.containsKey(i)){
                matrix.put(i, new HashSet<>());
            }
        }

        System.out.println(matrix.values());
        boolean vseOk = true;
        for(Set<Integer> t : matrix.values()){
            if(t.size() < vertex-1){
                vseOk = false;
                break;
            }
        }

        System.out.println(vseOk ? "YES" : "NO");




    }
}
