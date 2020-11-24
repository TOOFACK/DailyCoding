package Sprint6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         String[] line = bf.readLine().split(" ");
         for(int i =line.length-1; i >-1; i--){
             System.out.print(line[i] + " ");
         }

    }
}
