package Sprint6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class D {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();

        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < line.length(); i++) {
            String s = String.valueOf(line.charAt(i));
            if(!list.contains(s) && !hashMap.containsKey(s)){
                list.add(s);
             }

            if(hashMap.containsKey(s) && list.contains(s)){

                list.remove(s);

            } else{
                hashMap.put(s,1);
            }
        }

        System.out.println(list.size() != 0 ? "YES" + "\n" + list.get(0) : "NO");
    }
}
