package Codeforces.CFGlobalR12;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;


public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int temp = Integer.parseInt(bf.readLine());
        int i = 0;
        ArrayList<String> ans = new ArrayList<>();


        while(i < temp){
            i++;
            int lenLine = Integer.parseInt(bf.readLine());
            String line = bf.readLine();
            int con = 0;
            for(int j =0; j < lenLine; j++){
               if(line.charAt(j) == 'b'){
                   con++;
               }
            }
          line  =   line.replaceAll("b","");
            for(int j = 0; j < con; j++){
                line = String.format("b%s", line);
            }

        ans.add(line);

        }
        for(String s : ans){
            System.out.println(s);
        }
    }
}
