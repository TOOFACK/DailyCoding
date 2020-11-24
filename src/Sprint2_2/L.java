package Sprint2_2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class L {
    public static int chet = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        int temp = in.nextInt();
        int[] monets = new int[temp];
        for(int i =0; i< temp; i++){
            monets[i] = in.nextInt();
        }
        Arrays.sort(monets);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        System.out.println(search(val,stack, monets,0));

    }
    public static int search(int remain, Stack<Integer> stack, int[] monets, int index){
        System.out.print("Stack ");
        for(int s: stack){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("remain = " + remain);

        for(int i = index; i < monets.length; i++){
            if(stack.peek() <= monets[i] && remain-monets[i] >= 0){
                stack.push(monets[i]);
                remain = remain - monets[i];
                return search(remain,stack,monets,index);
            } else if(remain == 0){
                chet++;
                index++;
                return search(remain + stack.pop(),stack,monets,index);
            } else {
                remain = remain + stack.pop();
//                if(stack.peek() == 0){
//                    return 0;
//                } else
                {
                    return search(remain, stack, monets, index);
                }

            }
        }
        return chet;
    }
}
