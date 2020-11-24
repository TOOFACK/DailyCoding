package Sprint1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StackMaxEffective {
    private LinkedList<Integer> stack;
    private LinkedList<Integer> max;

    public StackMaxEffective() {
        this.stack = new LinkedList<>();
        this.max = new LinkedList<>();
    }

    public String get_max(){
        if(this.max.size() == 0){
            return "None";
        }
        else
        {
            return String.valueOf(this.max.get(max.size()-1));
        }

    }


    public void push(int val){

        this.stack.add(val);
        if(this.max.size() != 0) {
            if (val >=   this.max.getLast()) {
//                System.out.println("Now max is (after pushing) " + this.max.get(max.size()-1));
                this.max.add(val);
            }
        }else{
                this.max.add(val);
            }
        }





    public String pop() {
        if (this.stack.size() == 0) {
            return "error";
        } else

        if(this.max.getLast().equals(this.stack.getLast())){
//            System.out.println("Now max is (after popping)" + this.max.get(max.size() -1 ));
            this.max.removeLast();

        }
            this.stack.removeLast();

        return null;
    }

    public static void main(String[] args) {
        StackMaxEffective stack = new StackMaxEffective();

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
                String[] comms;
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
