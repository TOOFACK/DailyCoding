package Sprint4;

import Sprint1.A;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class F {
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

    public static List<String> treeSolution(Node head) {
        ArrayDeque<Node> deq = new ArrayDeque<>();
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<Integer> tempList = new ArrayList<>();
        ans.add(String.valueOf(head.value));
        int prev = 1;
        int next = 0;
        deq.add(head);


        while (deq.size() != 0) {



            if (prev == 0) {
                prev = next;
                next = 0;
                for (Node node : deq) {
                    tempList.add((node.value));
                }

                ans.add(String.valueOf(tempList.get(0)));
                tempList.clear();
            }



            Node curr = deq.pollFirst();
            prev--;

            if (curr.left != null) {
                deq.add(curr.left);
                next++;
            }
            if (curr.right != null) {
                deq.add(curr.right);
                next++;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Node one = new Node(1);

        Node two = new Node(2);
        Node three = new Node(3);

        Node four = new Node(4);
        Node five = new Node(5);
        Node eight = new Node(8);
        Node ten = new Node(10);

        Node seventeen = new Node(17);
        Node fourtenn = new Node(14);

        one.left = two;
        one.right = three;

        two.left = four;
        two.right = five;

        three.left = eight;
        three.right = ten;

        eight.left = seventeen;
        ten.left = fourtenn;

        for(String s:treeSolution(one)){
            System.out.print(s+" ");
        }

    }


}
