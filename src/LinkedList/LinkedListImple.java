package LinkedList;

public class LinkedListImple {

        private int head;
        private int tail;
        private int size;

        LinkedListImple() {
            this.size = 0;
        }

    public void InsertFirst(int value){
       // Node node =new Node(value);
       // node.next=head;
        //head=node;
    }
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;

        }
    }






    public static void main(String[] args) {


    }

}
