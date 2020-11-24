package CodeEveryDay.leetCode.Mock1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().replaceAll("[^a-zA-Z ]", "").split("\\s+");
        String[] banned = br.readLine().split(" ");
        int countBannedAperaring =0;

        HashMap<String,Integer> chet = new HashMap<>();
        for(String s : line){
            chet.put(s,0);
        }

        System.out.println(chet.keySet());

        for(String s : line){
            int ad = chet.get(s);
            chet.put(s,ad + 1);
        }
        System.out.println(chet.values());

        
    }
}
