package Sprint4;

import Sprint1.A;
import Sprint4.A.Node2;
import org.w3c.dom.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class GraphClass {
    static ArrayList<Integer> path1 = new ArrayList<>();
    public static ArrayList<Integer> dfs(Node2 head){

        if(head.left != null){
            //if head has left then start dfs from head.left
            dfs(head.left);
        }
        if(head.right != null){
            //if head has right then start dfs from head.right
            dfs(head.right);
        }
        //add value to answer
        path1.add(head.value);
        return path1;
        //ans
    }

    public static ArrayList<Integer> bfs(Node2 head){
        ArrayDeque<Node2> q = new ArrayDeque<>();
        //space for our "roots"
        q.add(head);
        //add root
        ArrayList<Integer> path = new ArrayList<>();
        while(q.size() != 0){
            // while deq isnt empty do
            Node2 curr = q.pollFirst();
            //get the root
            path.add(curr.value);
            //add root to answer
            if(curr.left != null){
                q.add(curr.left);
                //if root has left -> add to deq left
            }
            if(curr.right != null){
                q.add(curr.right);
                //if root has right -> add right to deq
            }

        }
        return path;
        //ans
    }

    public static void main(String[] args) {
        Node2 head = new Node2(1);
        Node2 two1 = new Node2(2);
        Node2 three1 = new Node2(3);
        Node2 four1 = new Node2(4);
        Node2 six1 = new Node2(6);
        Node2 two2 = new Node2(2);
        Node2 three2 = new Node2(3);
        Node2 four2 = new Node2(4);
        Node2 five1 = new Node2(5);
        Node2 five2 = new Node2(5);
        Node2 six2 = new Node2(6);
        Node2 seven1 = new Node2(7);
        Node2 seven2 = new Node2(7);

        head.left = two1;
        head.right = two2;

        two1.left = four1;
        two1.right = three1;

        four1.left = five1;
        four1.right = six1;

      three1.right = seven1;

        two2.left = three2;
        two2.right = four2;

        four2.left = six2;
        four2.right = five2;

        three1.left= seven2;

        for(int t : dfs(head)){
            System.out.print(t + " ");
        }
        System.out.println();
        for(int t : bfs(head)){
            System.out.print(t + " ");
        }


    }
}
