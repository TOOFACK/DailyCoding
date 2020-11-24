package Sprint1_review;

public class Solution {

    public static String hasCycle (Node head){

        if(head.getNext()== null || head == null) return "False";
        else  if(head.getNext() == head) return "True";
        Node temp1 = head;
        Node temp2 = head;

        while(temp2 != null){
            temp1 = temp1.getNext();
            temp2 = temp2.getNext();
            if(temp2 != null){
                temp2 = temp2.getNext();
            } else{
                return "False";
            }
            if(temp1 == temp2) return "True";
        }
        return "False";

    }

}
