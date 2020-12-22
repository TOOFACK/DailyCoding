package Sprint7_review;

import java.io.*;
import java.util.*;

public class A {
  static   int verts;
  static   ArrayList<List<Integer>> arrayList;
    public A(int verts) {
        A.verts = verts;
        arrayList= new ArrayList<>(verts+1);
        for(int i =0; i < verts+1; i++){
            arrayList.add(new LinkedList<>());
        }
    }

    private void add(int source, int dest) {
        arrayList.get(source).add(dest);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"), 15000);
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        PrintWriter out = new PrintWriter(System.out);

        int verts = Integer.parseInt(st.nextToken());

        A a = new A(verts);

        for(int i =0; i < verts-1; i++){
            String line = reader.readLine();

            for(int j=0; j < line.length(); j++){
                char ch = line.charAt(j);
                if(ch == 'B'){

                    a.add(j+i+1,i);
                } else{

                    a.add(i,i+j+1);

                }
            }
        }
        int i =0;

        if(isCyclic())
            System.out.println("NO");
        else
            System.out.println("YES");
    }

    private static boolean isCyclic() {
        boolean[] visited = new boolean[verts];
        boolean[] Stack = new boolean[verts];

        for (int i = 0; i <verts ; i++)
            if (isCyclicU(i, visited, Stack))
                return true;

        return false;
    }

    private static boolean isCyclicU(int i, boolean[] visited, boolean[] Stack) {
        if (Stack[i])
            return true;

        if (visited[i])
            return false;

        visited[i] = true;

        Stack[i] = true;
        List<Integer> children = arrayList.get(i);

        for (Integer c: children)
            if (isCyclicU(c, visited, Stack))
                return true;

        Stack[i] = false;

        return false;
    }


}
