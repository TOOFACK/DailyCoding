package Sprint7;


import java.util.ArrayDeque;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vertex = in.nextInt();
        int edge = in.nextInt();

        int[][] vertexes = new int[edge][2];
        for(int i =0 ; i < edge; i++){
            vertexes[i][0] = in.nextInt();
            vertexes[i][1] = in.nextInt();
        }
        int s = in.nextInt();
    }

    void bfs(int s, int[][] graph){
        int dist[] = new int[graph.length];
        int color[] = new int[graph.length];
        int parent[] = new int[graph.length];

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for(int i =0; i < graph.length; i++){

            dist[i] = Integer.MAX_VALUE;
            color[i] = 0;
            parent[i] = -1;

        }

        dist[s-1] = 0;
        color[s-1] = 1;
        parent[s-1] = -1;

        queue.add(s);

        while(!queue.isEmpty()){
            int u = queue.pollFirst();

            for(int i : graph[u-1]){
                if(color[i-1])
            }
        }

    }
}
