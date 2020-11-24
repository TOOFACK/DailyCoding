package Sprint1_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            String[] syms = s.split(" ");
            Stack<Integer> stack = new Stack<>();


            for (String sym : syms) {


                if (!sym.equals("+") && !sym.equals("-") && !sym.equals("*") && !sym.equals("/")) {
                    stack.add(Integer.valueOf(sym));

                } else if (sym.equals("+")) {
//                    System.out.println("+ " + (stack.peek() + stack.peek()));
                    int c1 = stack.pop();
                    int c2 = stack.pop();
                    stack.push(c2 + c1);



                } else if (sym.equals("-")) {
//                    System.out.println("- " + (stack.peek() - stack.peek()));
                    int c1 = stack.pop();
                    int c2 = stack.pop();
                    stack.push(c2 - c1);


                } else if (sym.equals("*")) {
//                    System.out.println("* " + (stack.peek() * stack.peek()));
                    int c1 = stack.pop();
                    int c2 = stack.pop();
                    stack.push(c2 * c1);

                } else {
//                    System.out.println("/ " + (stack.peek() / stack.peek()));
                    int c1 = stack.pop();
                    int c2 = stack.pop();
                    stack.push(c2 / c1);
                }


            }
            System.out.println(stack.pop());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
