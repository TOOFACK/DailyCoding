package Sprint1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MyQueueSized {

   private int max_size;
   private LinkedList<Integer> q;

    public MyQueueSized(int max_size) {
        this.max_size = max_size;
        this.q = new LinkedList<>();
    }

    public String push(int val){

        if(this.q.size() >= this.max_size) {
//            System.out.println("error");
            return "error";
        }

        this.q.add(val);
//        System.out.println("size of queue " + this.q.size());
        return null;
    }

    public String pop(){
        if(this.q.size() == 0)
            return "None";

        int val = this.q.getFirst();
        this.q.removeFirst();
        return String.valueOf(val);
    }

    public String peek(){
        if(this.q.size() == 0)
            return "None";
        return String.valueOf(this.q.getFirst());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int temp = Integer.parseInt(br.readLine());
            int size = Integer.parseInt(br.readLine());
            ArrayList<String> ans = new ArrayList<>();
            MyQueueSized queue = new MyQueueSized(size);

            for(int i =0; i < temp; i++){
                try {
                    String[] comms;
                    String s =  br.readLine();

                    comms = s.split(" ");
                    if(comms[0].equalsIgnoreCase("peek")){
                        ans.add( queue.peek());
                    } else if(comms[0].equalsIgnoreCase("pop")){
                        ans.add(queue.pop());
                    } else if(comms[0].equalsIgnoreCase("push")){
                       ans.add(queue.push(Integer.parseInt(comms[1])));
                    } else if(comms[0].equalsIgnoreCase("size")) {
                        ans.add(String.valueOf(queue.q.size()));
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
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
