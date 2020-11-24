import Sprint4_review.B;

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

    static class Res{
        int res = Integer.MIN_VALUE;
    }
    public static int res = Integer.MIN_VALUE;
    public static String treeSolution(Node head){
        Res res = new Res();
        findMaxPath(head,res);
        return String.valueOf(res.res);
    }

    public static int findMaxPath(Node node, Res res){

        if(node == null){
            return 0;
        }

        int l = findMaxPath(node.left, res);
        int r = findMaxPath(node.right, res);

        int maxCurr = Math.max(Math.max(l,r) + node.value, node.value);


        int pathSum = Math.max(maxCurr, l + r + node.value);

        res.res = Math.max(pathSum, res.res);


        return maxCurr;
    }


}
