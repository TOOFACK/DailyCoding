package Sprint8_review;

import java.io.*;
import java.util.ArrayList;

import java.util.HashMap;

public class B {
    static int ans = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int amount_vert = (int) in.nval;
        in.nextToken();
        int need = (int) in.nval;

        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();


        for (int i = 0; i < amount_vert - 1; i++) {
            in.nextToken();
            int v1 = (int) in.nval;
            in.nextToken();
            int v2 = (int) in.nval;
            if (v1 != v2) {
                ArrayList<Integer> t;
                if (!graph.containsKey(v1)) {
                    t = new ArrayList<>();
                } else {
                    t = graph.get(v1);
                }
                t.add(v2);
                graph.put(v1, t);

                ArrayList<Integer> g;
                if (!graph.containsKey(v2)) {
                    g = new ArrayList<>();
                } else {
                    g = graph.get(v2);
                }
                g.add(v1);
                graph.put(v2, g);
            }
        }


        dfs(1, 0, graph, ans, need, amount_vert);
        System.out.println(ans);

    }
    static void f() {
        ans = 1;
    }    private static ArrayList<Integer> dfs(int node, int parent, HashMap<Integer, ArrayList<Integer>> graph, int ans, int need, int verts) {
        ArrayList<Integer> count = new ArrayList<>(1 + verts);
        for(int i =0; i < 1+verts; i++ ){
            count.add(Integer.MAX_VALUE);
        }

        int child = graph.get(node).size();
        if (parent != 0) {
            child--;
        }

        count.set(1,child);
        for (int child1 : graph.get(node)) {
            if (child1 == parent) {
                continue;
            }
            ArrayList<Integer> childCount = dfs(child1, node, graph, ans, need, verts);
            for (int i = verts; i >= 1; i--) {
                if (count.get(i) == Integer.MAX_VALUE) {
                    continue;
                }
                for (int j = 1; j <= verts; j++) {
                    if (childCount.get(j) == Integer.MAX_VALUE) {
                        continue;
                    }
                    if (i + j <= verts) {
                        count.set(i + j,Math.min(count.get(i + j), count.get(i) + childCount.get(j) - 1));
                    }
                }
            }
        }

        if (parent == 0) {

            B.ans = Math.min(ans, count.get(need));
        } else{

            B.ans = Math.min(ans, count.get(need) + 1);
        }


        return count;

    }


}


