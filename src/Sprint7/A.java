package Sprint7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class A {

    static boolean[] visited;

    public A(int verts) {
        visited = new boolean[verts + 1];
    }

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

        if(vertex != 0) {
            A a = new A(vertex);
            a.dfs(Integer.parseInt(bf.readLine()), graph);
        }
    }
      void dfs(int u, HashMap<Integer, ArrayList<Integer>> graph){
        visited[u] = true;
          System.out.print(u + " ");
          ArrayList<Integer> ver = graph.get(u);
          if(ver != null) {
              Collections.sort(ver);
              for (int v : graph.get(u)) {
                  if (!visited[v]) dfs(v, graph);
              }
          }
    }


    }


