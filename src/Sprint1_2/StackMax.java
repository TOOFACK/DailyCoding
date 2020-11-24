package Sprint1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StackMax {

    private ArrayList<Integer> stack;

    public StackMax() {
        this.stack = new ArrayList<>();
    }

    public String get_max(){
        if(this.stack.size() == 0){
//            System.out.println("None");
        return "None";
        }

        else
            {

            int max = Integer.MIN_VALUE;
            for(int s : stack){
                if(s > max){
                    max = s;
                }
            }
//                System.out.println(max);
            return String.valueOf(max);
        }

    }

    public void push(int val){
        this.stack.add(val);
    }

    public String pop() {
        if (this.stack.size() == 0) {
//            System.out.println("error");
            return "error";
        } else
            this.stack.remove(this.stack.size() - 1);
        return null;
    }



    public static void main(String[] args) {
        StackMax stack = new StackMax();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        int temp = 0;
        try {
            temp = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> ans = new ArrayList<>();

        for(int i =0; i < temp; i++){
            try {
                String[] comms = new String[2];
                String s =  br.readLine();
                
                comms = s.split(" ");
                if(comms[0].equalsIgnoreCase("get_max")){
                   ans.add( stack.get_max());
                } else if(comms[0].equalsIgnoreCase("pop")){
                    ans.add(stack.pop());
                } else if(comms[0].equalsIgnoreCase("push")){
                    stack.push(Integer.parseInt(comms[1]));
                }

            } catch (NullPointerException e) {
            }
            catch (IOException e) {
                e.printStackTrace();
            }


        }

        for(String s : ans){
            if(s != null){
            System.out.println(s);
            }

        }
    }

}
