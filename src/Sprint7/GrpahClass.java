package Sprint7;

import java.util.*;

public class GrpahClass {


    //BFS

    public static void bfs(int start, int vertsAm, HashMap<Integer, ArrayList<Integer>> graph) {

        ArrayDeque<Integer> q = new ArrayDeque<>();
        //+1 because index starts from 0
        int[] dist = new int[vertsAm + 1];
        int[] color = new int[vertsAm + 1];
        int[] parent = new int[vertsAm + 1];

        Set<Integer> vertexes = graph.keySet();
        for (int i : vertexes) {

            dist[i] = -1;
            color[i] = 0;
            parent[i] = -1;

        }

        dist[start] = 0;
        color[start] = 1;
        q.add(start);

        while (!q.isEmpty()) {
            int u = q.pollFirst();
            ArrayList<Integer> er = graph.get(u);

            for (int v : er) {
                if (color[v] == 0) {
                    dist[v] = dist[u] + 1;
                    parent[v] = u;
                    q.add(v);
                    color[v] = 1;
                }
            }
            color[u] = 2;
        }
    }

    //DFS

    public static boolean[] visited = new boolean[12]; //Vert amount

    void dfs(int u, HashMap<Integer, ArrayList<Integer>> graph) {
        visited[u] = true;
        ArrayList<Integer> ver = graph.get(u);
        if (ver != null) {
            for (int v : graph.get(u)) {
                if (!visited[v]) dfs(v, graph);
            }
        }
    }

    void mainDFS(HashMap<Integer, ArrayList<Integer>> graph){
        for(int i : graph.keySet()){
            if(!visited[i]){
                dfs(i, graph);
            }
        }
    }

}
