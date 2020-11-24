package Sprint6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class C {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String line = bf.readLine();

        HashMap<Character, Integer> vals = new HashMap<>();

        for(int i =0; i < line.length(); i++){
            if(!vals.containsKey(line.charAt(i))){
                vals.put(line.charAt(i), 1);
            } else {
                int t = vals.get(line.charAt(i));

            }
        }
    }

    }

