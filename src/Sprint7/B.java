package Sprint7;


import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/home/pavel/input.txt"));
        String[] line = bf.readLine().split(" ");

        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

        int vertex = Integer.parseInt(line[0]);
        int edge = Integer.parseInt(line[1]);

        for(int i = 0; i < edge; i++){
            line = bf.readLine().split(" ");
            int v1 = Integer.parseInt(line[0]);
            int v2 = Integer.parseInt(line[1]);
            if(v1 != v2) {
                if (!graph.containsKey(v1)) {
                    ArrayList<Integer> t = new ArrayList<>();
                    t.add(v2);
                    graph.put(v1, t);
                } else {
                    ArrayList<Integer> t = graph.get(v1);
                    t.add(v2);
                    graph.put(v1, t);
                }

                if (!graph.containsKey(v2)) {
                    ArrayList<Integer> t = new ArrayList<>();
                    t.add(v1);
                    graph.put(v2, t);
                } else {
                    ArrayList<Integer> t = graph.get(v2);
                    t.add(v1);
                    graph.put(v2, t);
                }
            }

        }
        if(vertex != 0) {
            int s = Integer.parseInt(bf.readLine());
            bfs(s,graph,vertex);
        }
//        System.out.println(s);
//        System.out.println(graph.toString());



    }

    static void  bfs(int s, HashMap<Integer, ArrayList<Integer>> graph,int f){
        Set<Integer> ans = new LinkedHashSet<>();
        ans.add(s);

        int[] color = new int[f + 1];

        ArrayDeque<Integer> q = new ArrayDeque<>();
        Set<Integer> vertexes = graph.keySet();
        for(int i : vertexes){

            color[i] = 0;

        }

        color[s] = 1;
        q.add(s);

        while (!q.isEmpty()) {
            int u = q.pollFirst();
            ArrayList<Integer> er = graph.get(u);
            if (er != null) {
                Collections.sort(er);

                for (int v : er) {
                    ans.add(v);
                    if (color[v] == 0) {
                        q.add(v);
                        color[v] = 1;
                    }
                    color[u] = 2;
                }
            }
        }

        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
