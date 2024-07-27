package PatternsQ;

public class LinkedList1 {

private Node head;  //these are instance variale of same class lINkedList
private Node tail;
private int size=0;
public LinkedList1(int size) {
        this.size = 0;
    }

    public void insertFirst(int val){
    Node node =new Node(val);
    node.next=head;
    head=node;

    if(tail==null){
        tail=head;
    }
    size+=1;
    }





















   private class Node{
    private int value;
    private Node next;


    public Node(int value) {
        this.value = value;
        this.next=null;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
}

