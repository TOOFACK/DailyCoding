package Sprint5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class F {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = bf.readLine();
        String secLine = bf.readLine();

        HashMap<Character, Character> hashMap = new HashMap<>();
        boolean tr = true;

        if(firstLine.length() == secLine.length()) {


            for (int i = 0; i < firstLine.length(); i++) {
                if (hashMap.containsKey(firstLine.charAt(i))) {
                    if (hashMap.get(firstLine.charAt(i)) != secLine.charAt(i)) {

                        tr = false;
                        break;
                    }
                } else if(!hashMap.containsValue(secLine.charAt(i))){
                    hashMap.put(firstLine.charAt(i), secLine.charAt(i));
                }
                else{
                    tr = false;
                    break;
                }
            }
        }
        else{
            tr = false;
        }

        System.out.println(tr?"YES":"NO");
    }
}
