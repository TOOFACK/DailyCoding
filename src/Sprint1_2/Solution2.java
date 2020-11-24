package Sprint1_2;

public class Solution2 {



    public static Node<String> solution(Node<String> head){


        Node<String> node = head;

        while(true){
            Node<String> tempNode = node.next;
            node.next = node.prev;
            node.prev = tempNode;
            if(tempNode == null)
                return node;
            node = node.prev;

        }

    }

//    public static int solution(Sprint1_2.Node<String> head, String elem){
//
//        int i = 0;
//        Sprint1_2.Node<String> node = head;
//        while(true){
//
//            if(node.value.equalsIgnoreCase(elem)){
//                return i;
//            } else if(node.next == null){
//                return -1;
//            } else{
//                node = node.next;
//                i++;
//            }
//        }
//
//    }
//    public static Sprint1_2.Node<String> solution(Sprint1_2.Node<String> head, int idx){
//
//        Sprint1_2.Node<String> node = head;
//
//        if(idx == 0){
//            head = head.next;
//            return head;
//        }else{
//
//            for(int i =0; i < idx-1; i++){
//                node = node.next;
////                System.out.println(prevNode.value);
//            }
//            node.next = node.next.next;
//            return head;
//        }
//
//
//
//    }

//    public static void printNodes(Sprint1_2.Node<String> head){
//
//        Sprint1_2.Node<String> node = head;
//        System.out.println(node.value);
//
//        do{
//            node = node.next;
//            System.out.println(node.value);
//
//        } while(node.next != null);
//    }
//
//    public static void main(String[] args) {
////        Sprint1_2.Node<String> n2 = new Sprint1_2.Node<>("b",null,n1);
//        Sprint1_2.Node<String> n1 = new Sprint1_2.Node<>("a",null,null);
//
//
//        System.out.println((solution(n1).value + " " + solution(n1).prev + " " + solution(n1).next));
//    }

}
