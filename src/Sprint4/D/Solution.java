package Sprint4.D;

import Sprint4.A.Node2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

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

    public static String treeSolution(Node head){
        ArrayDeque<Node> deq = new ArrayDeque<>();
        deq.add(head);


        ArrayList<Integer> tempList = new ArrayList<>();
        int parentsAmount = 1;
        int nextAmount = 0;
        tempList.add((head.value));
        tempList.clear();
        int lvl = 0;

        String tr = "True";


        while(deq.size() != 0){
            boolean notZero = false;


            if(parentsAmount == 0){
                parentsAmount = nextAmount;
                nextAmount = 0;
                for(Node node : deq){
                    tempList.add((node.value));
                }

                for(int s : tempList){
                    System.out.print(s + " ");
                }
                System.out.println();

                for(int s : tempList){
                    if (s != 0) {
                        notZero = true;
                        break;
                    }
                }

                if(!notZero){

                    break;
                }

                if(tempList.size() == 1 && lvl >= 1) {
                    tr = "False";
                    break;
                }else{

                    int m = tempList.size() / 2;
                    for (int i = 0; i < m; i++) {
                        if (!tempList.get(i).equals(tempList.get(tempList.size() - 1 - i))) {
                            tr = "False";
                            break;
                        }
                    }
                    System.out.println(tr);
                }
                lvl++;




                tempList.clear();
            }






            Node curr = deq.pollFirst();
            parentsAmount--;



            if(curr.left != null){
                deq.add(curr.left);
                nextAmount++;
            }
            else{
                deq.add(new Node(0));
                nextAmount++;
            }
            if(curr.right != null){
                deq.add(curr.right);
                nextAmount++;
            }   else{
                deq.add(new Node(0));
                nextAmount++;
            }






        }

        return tr;
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

            two2.left = four2;
            two2.right = three2;











        System.out.println(treeSolution(head));
    }
}
