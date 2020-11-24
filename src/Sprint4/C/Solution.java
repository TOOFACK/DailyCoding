package Sprint4.C;

import Sprint1.A;
import Sprint4.A.Node2;

import java.util.*;

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
   static List<List<String>> ans = new ArrayList<>();

    public static List<List<String>> treeSolution(Node head){
        ArrayDeque<Node> deq = new ArrayDeque<>();
        deq.add(head);

        ArrayList<String> tempList = new ArrayList<>();
        int parentsAmount = 1;
        int nextAmount = 0;
        tempList.add(String.valueOf(head.value));
        ans.add(new ArrayList<>(tempList));
        tempList.clear();

        while(deq.size() != 0){



            if(parentsAmount == 0){
                parentsAmount = nextAmount;
                nextAmount = 0;
                for(Node node : deq){
                    tempList.add(String.valueOf(node.value));
                }
//                System.out.println("TEMPLIST");
//                for(String l : tempList){
//                    System.out.print(l + " ");
//                }
//                System.out.println();
                ans.add(new ArrayList<>( tempList));


//                System.out.println("ANS");
//                for(List<String> list : ans){
//                    System.out.println(Arrays.toString(list.toArray()));
//                    System.out.println();
//                }


                tempList.clear();
            }


            Node curr = deq.pollFirst();
            parentsAmount--;



            if(curr.left != null){
                deq.add(curr.left);
                nextAmount++;
            }
            if(curr.right != null){
                deq.add(curr.right);
                nextAmount++;
            }





        }

//        System.out.println("ANS2");
//        for(List<String> list : ans){
//            System.out.println(Arrays.toString(list.toArray()));
//            System.out.println();
//        }
        return ans;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node two1 = new Node(2);
        Node three1 = new Node(3);
        Node four1 = new Node(4);
        Node six1 = new Node(6);
        Node two2 = new Node(2);
        Node three2 = new Node(3);
        Node four2 = new Node(4);
        Node five1 = new Node(5);
        Node five2 = new Node(5);
        Node six2 = new Node(6);
        Node seven1 = new Node(7);
        Node seven2 = new Node(7);

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

        List<List<String>> l = treeSolution(head);
        System.out.println("AMSMDSAMD");
        for(List<String> list : l){
            for(String d : list){
                System.out.print(d + " ");
            }
            System.out.println();
        }

    }
}
