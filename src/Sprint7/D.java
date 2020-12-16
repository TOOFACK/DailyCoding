package Sprint7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class D {
    public static boolean[] visited;
    public  static  LinkedList<Integer> q;

    public D(int vert) {
        visited = new boolean[vert + 1];
        q = new LinkedList<>();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/pavel/input.txt"),15000);
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        PrintWriter out = new PrintWriter(System.out);

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(reader.readLine(), " ");

            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            if (v1 != v2) {
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
        for(int i = 1; i < vertex + 1; i++){
            if(!graph.containsKey(i)){
                graph.put(i, new ArrayList<>());
            }
        }
        D d = new D(vertex);
        d.mainDFS(graph);
        for (int i : q){
            out.print(i + " ");
        }
        out.flush();
    }

    void dfs(int u, Map<Integer, ArrayList<Integer>> graph) {
        visited[u] = true;
        ArrayList<Integer> ver = graph.get(u);
        if (ver != null) {
            for (int v : graph.get(u)) {
                if (!visited[v]) dfs(v, graph);
            }
        }
        q.addFirst(u);
    }

    void mainDFS(Map<Integer, ArrayList<Integer>> graph){
        for(int i : graph.keySet()){
            if(!visited[i]){
                dfs(i, graph);
            }
        }
    }
}
