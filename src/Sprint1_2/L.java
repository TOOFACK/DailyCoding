package Sprint1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class L {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(is_correct_bracket_seq(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean is_correct_bracket_seq(String line){


        char[] arr = line.toCharArray();
        if(arr.length % 2 != 0 )
        return false;

        Stack<Character> sHalf = new Stack<>();


        for(char s : arr){
            sHalf.push(s);
        }
       for(int i = 0; i < arr.length; i++){
          char f =  sHalf.pop();
          if(f == '}'){

          }
       }

        return true;

    }
}
