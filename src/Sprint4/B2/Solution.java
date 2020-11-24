package Sprint4.B2;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Solution {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    public static String treeSolution(Node... heads){
        ArrayDeque<Node> q1 = new ArrayDeque<>();
        ArrayDeque<Node> q2 = new ArrayDeque<>();

        q1.add(heads[0]);
        q2.add(heads[1]);

        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList<Integer> path2 = new ArrayList<>();

        boolean tr = true;

        while(q1.size() != 0 && q2.size() != 0){
            Node curr1 = q1.pollFirst();
            Node curr2 = q2.pollFirst();

            path1.add(curr1.value);
            path2.add(curr2.value);

//            System.out.println(path1.get(path1.size() - 1));
//            System.out.println(path2.get(path2.size() - 1));
            if(!path1.get(path1.size() - 1).equals(path2.get(path2.size() - 1))){
                tr = false;
                break;
            }

            if(curr1.left != null){
                q1.add(curr1.left);
            }
            if(curr2.left != null){
                q2.add(curr2.left);
            }
            if(q1.size() != q2.size()){
                tr = false;
                break;
            }


            if(curr1.right != null){
                q1.add(curr1.right);
            }
            if(curr2.right != null){
                q2.add(curr2.right);
            }

            if(q1.size() != q2.size()){
                tr = false;
                break;
            }
        }
        if(tr){
            return "True";
        } else{
            return "False";
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node one = new Node(2);
        Node two = new Node(3);



        head.left = one;
        head.right = two;




        Node head1 = new Node(1);
        Node one1 = new Node(2);
        Node two1 = new Node(4);



        head1.right = two1;
        head1.left = one1;




        System.out.println(treeSolution(new Node[]{head, head1}));
    }
}
