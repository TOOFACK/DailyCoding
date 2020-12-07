package Sprint7;


import java.util.Arrays;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vertex = in.nextInt();
        int edge = in.nextInt();

        int[][] graph = new int[vertex+1][vertex+1];


        for(int i =0; i < edge; i++) {
            int v1 = in.nextInt();
            int v2 = in.nextInt();
            if (v1 != v2) {
                if (Arrays.stream(graph[v2]).noneMatch(x -> x == v1)) {
                        graph[v1][v2] =1;
                        graph[v2][v1] = 1;

                }
            }
        }
        boolean vseOk = true;

        for(int i =1; i < vertex + 1; i++){
            int sum = Arrays.stream(graph[i]).sum();
            if(sum < vertex - 1){
                vseOk = false;
                break;
            }
        }

        System.out.println(vseOk ? "YES" : "NO");
    }
}
