package Sprint4;

public class B {
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
    public static int heightOfBinaryTree(Node node)
    {
        if (node == null)
        {
            return 0;
        }
        else
        {
            return 1 +
                    Math.max(heightOfBinaryTree(node.left),
                            heightOfBinaryTree(node.right));
        }
    }

    public static String treeSolution(Node head){

         if(head == null){
             return "True";
         } else if(treeSolution(head.right).equals("True") && treeSolution(head.left).equals("True")
                 && Math.abs(heightOfBinaryTree(head.left) - heightOfBinaryTree(head.right)) <= 1){
             return "True";
         }
         else return "False";

    }

    public static void main(String[] args) {
        Node head = new Node(0);

        Node one = new Node(1);
        Node two = new Node(2);

        Node three = new Node(3);
        Node four = new Node(4);

        Node five = new Node(5);
        Node six = new Node(6);
        Node sev = new Node(7);
        Node eight = new Node(8);

        head.left = one;
        head.right = two;

        one.left = three;
        three.left = five;
        three.right = six;

        two.right = four;
        four.left = sev;
        four.right = eight;

        System.out.println(treeSolution(head));

    }
}
