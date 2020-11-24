package Sprint5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;



public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        annagrams(bf.readLine().split(" "));

    }

    public static ArrayList<Integer> annagrams(String[] words){
        ArrayList<Integer> keys = new ArrayList<>();



        for(int i =0; i < words.length; i++){
            String[] sortedWord = words[i].split("");

//            System.out.println(Arrays.toString(sortedWord));
            int sumTemp = 1;
            for(int j = 0; j < sortedWord.length; j++){
                int val =0;
                switch (sortedWord[j].charAt(0)){
                    case 'a':
                       val = 2;
                       break;
                    case 'b':
                        val = 3;
                        break;
                    case 'c':
                        val = 5;
                        break;
                    case 'd':
                        val = 7;
                        break;
                    case 'e':
                        val = 11;
                        break;
                    case 'f':
                        val = 13;
                        break;
                    case 'g':
                        val = 17;
                        break;
                    case 'q':
                        val = 19;
                        break;
                    case 'w':
                        val = 23;
                        break;
                    case 'r':
                        val = 31;
                        break;
                    case 't':
                        val = 37;
                        break;
                    case 'y':
                        val = 41;
                        break;
                    case 'u':
                        val = 43;
                        break;
                    case 'i':
                        val = 47;
                        break;
                    case 'o':
                        val = 53;
                        break;
                    case 'p':
                        val = 59;
                        break;
                    case 's':
                        val = 61;
                        break;
                    case 'h':
                        val = 71;
                        break;
                    case 'j':
                        val = 73;
                        break;
                    case 'k':
                        val = 79;
                        break;
                    case 'l':
                        val = 83;
                        break;
                    case 'z':
                        val = 89;
                        break;
                    case 'x':
                        val = 97;
                        break;
                    case 'v':
                        val = 101;
                        break;
                    case 'n':
                        val = 103;
                        break;
                    case 'm':
                        val = 107;
                        break;

                }
                sumTemp *=  val;
//                System.out.println(val);
            }
//            System.out.println(sumTemp);
            keys.add(sumTemp);
        }

//        for(String s : words){
//            System.out.print(s + " ");
//        }
//        System.out.println();

//        for(int t : keys){
//            System.out.print(t + " ");
//        }
//        System.out.println();

            ArrayList<Integer> ans = new ArrayList<>();

        for(int t : keys){
            int i = 0;

            while(i < keys.size()){
                if(keys.get(i) == t && keys.get(i) != -1){
                    keys.set(i,-1);
                    ans.add(i);
                }
                i++;
            }

            if(!ans.isEmpty()) {
                for (int d : ans) {
                    System.out.print(d + " ");
                }
                System.out.println();
            }
            ans.clear();
        }



        return keys;
    }


}
