package Sprint7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class F {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/home/pavel/input.txt"),15000);


        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

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
        PrintWriter  out = new PrintWriter(System.out);
        if(vertex != 0) {
             st = new StringTokenizer(bf.readLine(), " ");
            out.print(bfs(Integer.parseInt(st.nextToken()),graph,vertex, Integer.parseInt(st.nextToken())));
            out.flush();
        }
    }

    static int bfs(int s, HashMap<Integer, ArrayList<Integer>> graph, int f, int end){



        int[] color = new int[f + 1];
        int[] dist = new int[f + 1];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        Set<Integer> vertexes = graph.keySet();
        for(int i : vertexes){

            color[i] = 0;
            dist[i] = -1;

        }

        color[s] = 1;
        dist[s] = 0;
        q.add(s);

        boolean go = true;

        while (!q.isEmpty()) {
            int u = q.pollFirst();

            ArrayList<Integer> er = graph.get(u);
            if (er != null) {
                Collections.sort(er);

                for (int v : er) {
                    if (color[v] == 0) {
                        q.add(v);
                        color[v] = 1;
                        dist[v] = dist[u] + 1;
                    }
                    if(v == end){
                        go = false;
                        break;
                    }
                    color[u] = 2;
                }
            }
            if(!go) break;
        }
        return (dist[end]);

    }
}
