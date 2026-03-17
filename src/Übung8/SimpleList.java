package Übung8;

public class SimpleList {
    public Node head;

    public SimpleList (){
        head = new Node(Integer.MIN_VALUE);
    }

    public Node getFirst(Node n1){
        if (head.next == 0){
            return null
        } else return head.next;
    }
}
