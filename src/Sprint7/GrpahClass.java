package Sprint7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class GrpahClass {

    public static void bfs(int start, int vertsAm, HashMap<Integer, ArrayList<Integer>> graph){

        ArrayDeque<Integer> q = new ArrayDeque<>();
        //+1 because index starts from 0
        int[] dist = new int[vertsAm + 1];
        int[] color = new int[vertsAm + 1];
        int[] parent = new int[vertsAm + 1];

        Set<Integer> vertexes = graph.keySet();
        for(int i : vertexes){

            dist[i] = -1;
            color[i] = 0;
            parent[i] = -1;

        }

        dist[start] = 0;
        color[start] = 1;
        q.add(start);

        while(!q.isEmpty()){
            int u = q.pollFirst();
            ArrayList<Integer> er = graph.get(u);

            for(int v : er){
                if(color[v] == 0){
                    dist[v] = dist[u] + 1;
                    parent[v] = u;
                    q.add(v);
                    color[v] = 1;
                }
            }
            color[u] = 2;
        }
    }
}
