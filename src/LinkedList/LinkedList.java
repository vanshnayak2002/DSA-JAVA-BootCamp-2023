package LinkedList;

//STRUCTURE OF END
 public class LinkedList {
     private Node head;
     private Node tail;
     private int size;

     public LinkedList() {
         this.size = 0;
     }

     private class Node {
         int value;
         Node next;

         private Node(int value, Node next) {
             this.value = value;
             this.next = next;
         }

         private Node(int value) {
             this.value = value;
         }
     }
     //END OF STRUCTURE




//INSERTION FIRST LINKEDLIST
     public void InsertFirst(int value) {
         Node node = new Node(value);
         node.next = head;
         head = node;
         if (tail == null) {
             tail = head;
         }
         size++;
     }
     //END



//DISPLAY THE LINKED LIST
     public void display() {
         Node temp = head;
         while (temp != null) {
             System.out.print(temp.value + "->");
             temp = temp.next;
         }
         System.out.println("END");
     }
     //END



    //INSERTION AT LAST
     public void InsertLast(int value) {
         if (tail == null) {
             InsertFirst(value);
             return;
         }
       Node node=new Node(value);
         tail.next=node;
         tail=node;
         size++;

     }
 //END



    //INSERTION INDEXES
  public void InsertionIndex(int value,int index){
         if(index==0){
             InsertFirst(value);
          return;
         }
       if(index==size){
           InsertLast(value);
           return;
       }

     Node temp=head;
      for (int i = 1; i <index ; i++) {
          temp=temp.next;
      }  //index=temp.next
      Node node=new Node(value,temp.next);
      temp.next=node;
      size++;

     }
//END OF INSertion indexes

   //FIND
    public Node Find(int value){
         Node node=head;
         while(node!=null){
             if(node.value==value) {
                 return node;
             }
         node=node.next;
         }
     return node;
     }
//END


 //DUPLICATE delete leetcode

  public void  duplicate(){
     Node node=head;
         while (node.next!=null) {
             if (node.value == node.next.value) {
                 node.next = node.next.next;
                 size--;
             } else {
                 node = node.next;
             }
         }
         tail=node;
         tail.next=null;
         }

 //End


 }








