package Sprint1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StackSet {


    private Set<Integer> checkStack;
    private LinkedList<Integer> stack;


    public StackSet() {
        this.checkStack = new LinkedHashSet<>();
        this.stack = new LinkedList<>();

    }

    private void push(int val) {
        if(!this.checkStack.contains(val)){
            this.stack.add(val);
            this.checkStack.add(val);
        }
    }

    public String pop(){
        if(this.stack.size() == 0){
            return "error";
        }
        this.checkStack.remove(this.stack.getLast());
        this.stack.removeLast();

        return null;
    }

    public String peek(){
        if(this.stack.size() == 0){
            return "error";
        }
        return String.valueOf(this.stack.getLast());
    }








    public static void main(String[] args) {
        StackSet stack = new StackSet();

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
                if(comms[0].equalsIgnoreCase("peek")){
                    ans.add( stack.peek());
                } else if(comms[0].equalsIgnoreCase("pop")){
                    ans.add(stack.pop());
                } else if(comms[0].equalsIgnoreCase("push")){
                    stack.push(Integer.parseInt(comms[1]));
                } else if(comms[0].equalsIgnoreCase("size")) {
                    ans.add(String.valueOf(stack.stack.size()));
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