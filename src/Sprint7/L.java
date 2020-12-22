package Sprint7;


import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class L {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/pavel/input.txt"),15000);
        int vert = Integer.parseInt(reader.readLine());
         long sum = 0;
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        for(int i =0; i < vert; i++){
             sum = sum + Long.parseLong(st.nextToken());
        }
        sum /=2;
        if(vert - sum == 1){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
