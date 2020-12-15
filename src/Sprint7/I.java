package Sprint7;

import java.io.*;

import java.util.*;

public class I {

    static  int[] color;
    static int compCount = 1;

    public I(int verts) {
        color = new int[verts + 1];
        Arrays.fill(color, -1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/home/pavel/input.txt"), 15000);
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 15000);
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");


        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        I j = new I(vertex);

        for (int i = 0; i < edge; i++) {
            StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
            int v1 = Integer.parseInt(st2.nextToken());
            int v2 = Integer.parseInt(st2.nextToken());
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

        for (int i = 1; i < vertex + 1; i++) {
            if (color[i] == -1) {
                j.dfs(i, graph);
                compCount++;
            }

        }

//        System.out.println(Arrays.toString(color));
        out.println(compCount-1);

        out.flush();
//        System.out.println("COMP");
//        System.out.println(Arrays.toString(color));
        HashMap<Integer, ArrayList<Integer>> ans = new HashMap<>();
        int k = 1;
        for(int i = 1; i < color.length; i++){
            if(!ans.containsKey(color[i])){
                ArrayList<Integer> t = new ArrayList<>();
                t.add(i);
                ans.put(color[i],t);
            } else{
                ArrayList<Integer> t = ans.get(color[i]);
                t.add(i);
            }
//            System.out.println("k now is " + k);
        }
        for(int i : ans.keySet()){
            Collections.sort(ans.get(i));
        }
        for(ArrayList<Integer> t : ans.values()){
            for(int i : t){
                out.print(i + " ");
            }

            out.println();
            out.flush();
        }
    }

    void dfs(int u, HashMap<Integer, ArrayList<Integer>> graph) {
        color[u] = compCount;
//        System.out.println("vert = " + u + " comp = " + compCount);
        ArrayList<Integer> ver = graph.get(u);
        if (ver != null) {
            for (int v : graph.get(u)) {
                if (color[v] == -1) dfs(v, graph);
            }
        }


    }

}