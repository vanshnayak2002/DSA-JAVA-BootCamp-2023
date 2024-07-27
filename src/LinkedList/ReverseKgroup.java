package LinkedList;

import java.util.Stack;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
         this.next=null;
    }
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}




public class ReverseKgroup {


    public static Node reverseKGroup(Node head,int k){

        Stack<Integer>st=new Stack<>();
        int n=0;

        while(!st.empty()){
            if(st.size()<k){
            st.push(head.val);
            head=head.next;
        }


    }









    public static void main(String[] args) {
    Node node=new Node(1);
   node.next=new Node(2);
        node.next.next=new Node(3);
        node.next.next.next=new Node(4);
        node.next.next.next.next=new Node(5);
        reverseKGroup(node,2);

        Node temp=node;
        while(temp!=null){
            System.out.print(temp.val);
          temp=temp.next;
        }
        System.out.println();

    }

}
