package YandexIntership;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class E {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = in.nextInt();
        int m = in.nextInt();
        String pro = bf.readLine();

        ArrayList<String> rules = new ArrayList<>();
        ArrayList<String> worlds = new ArrayList<>();
        for(int i = 0; i < m; i++){
            rules.add(bf.readLine());
        }
        rules.add(pro);

        int temp = in.nextInt();
        for(int i =0; i < temp; i++){
            worlds.add(bf.readLine());
        }
        boolean findAll = true;
        ArrayList<String> ans = new ArrayList<>();
        for(String s : worlds){
            System.out.println(s);
            if(s.equals(pro)){
                ans.add("YES");
            } else{
                for(int i =0; i < s.length(); i++){
                    for(String t : rules){
                        System.out.println("Now try to find char = " + s.charAt(i) + " in " + t);
                        if (t.charAt(i) != s.charAt(i)) {
                            System.out.println("didn't find");
                            findAll = false;
                        } else{
                        System.out.println("Find");
                        findAll = true;
                        break;}
                    }

                    if(!findAll) break;
                }

                if(findAll){
                    ans.add("YES");
                } else ans.add("NO");
            }

        }
        System.out.println(ans.toString());
    }
}
