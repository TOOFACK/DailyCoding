package Sprint6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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
                t++;
                vals.put(line.charAt(i), t);
            }
        }

        Set<Character> keys2 = vals.keySet();
        ArrayList<Character> keys = new ArrayList<>(keys2);
        Collections.sort(keys);






        StringBuffer ans = new StringBuffer();
        boolean have1 = false;
        String haveOne = "";
        int len = 0;

        for(Character c : keys){
            int am = vals.get(c);
            if(vals.get(c) % 2 == 0){
                while(am > 0){
                    ans.insert(len,c);
                    ans.insert(ans.length() - len,c);
                    len++;
                    am = am - 2;


                }
            } else{

                while(am > 0){
                    if(am == 1 && have1){
                        break;
                    }
                    if (am == 1) {
                        have1 = true;
                        haveOne = String.valueOf(c);
                        break;
                    }

                    ans.insert(len,c);
                    ans.insert(ans.length() - len, c);
                    len++;
                    am = am - 2;


                }
            }


        }

        if(have1){
            ans.insert(ans.length() /2, haveOne);
        }
        System.out.println(ans);
    }

    }

