package Sprint7_review;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class C {



    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"), 15000);
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        PrintWriter out = new PrintWriter(System.out);


        int verts = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int ans = 0;


         int[][] grap = new int[verts + 1][verts + 1];
         boolean[] used = new boolean[verts+1];
         int[] minEdge = new int[verts + 1];
         int[] end = new int[verts + 1];

         int INF = Integer.MAX_VALUE;
         for(int i = 1; i < verts+ 1; i++){
             Arrays.fill(grap[i],INF);
         }
         Arrays.fill(minEdge, INF);
         Arrays.fill(end,-1);
         boolean did = false;

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            if (v1 != v2) {
                if(grap[v1][v2] == INF){
                    grap[v1][v2] = -weight;
                    grap[v2][v1] = -weight;
                } else if(grap[v1][v2] > -weight){
                    grap[v1][v2] = -weight;
                    grap[v2][v1] = -weight;
                }
            }
        }



        minEdge[1] = 0;
        for(int i = 1; i < verts +1; ++i){
            int v =-1;

                for(int j = 1; j < verts +1; ++j){
                    if(!used[j] && (v == -1 || minEdge[j] < minEdge[v]))
                        v = j;
                }

                if(minEdge[v] == INF){
                    out.println("Oops! I did it again");
                    out.flush();
                    did = true;
                }
                if(did){
                    break;
                }
                used[v] = true;
                if(end[v] != -1){
                    ans+= grap[v][end[v]];
                }

                for(int t = 1; t < verts + 1; ++t){
                    if(grap[v][t] < minEdge[t]){
                        minEdge[t] = grap[v][t];
                        end[t] = v;
                    }
                }
            System.out.println(v);
            System.out.println(Arrays.toString(minEdge));

        }


        if(!did)out.println(-ans);
        out.flush();

        }
}

