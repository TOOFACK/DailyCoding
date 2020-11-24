package Sprint4.A;

import java.util.ArrayList;

public class Solution3 {
    static int max = Integer.MIN_VALUE;
    public static int treeSolution(Node2 head){
        if (head.value > max)
            max = head.value;
        if(head.left != null){
              treeSolution(head.left);

        }
        if(head.right != null){
              treeSolution(head.right);
        }
       return max;


    }

}
