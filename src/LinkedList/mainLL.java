package LinkedList;

public class mainLL {

    public static void main(String[] args) {
      LinkedList list=new LinkedList();
       list.InsertFirst(4);
       list.InsertFirst(3);
       list.InsertFirst(2);
       list.InsertFirst(1);
       list.display();
       list.InsertLast(6);
       list.display();
       list.InsertionIndex(5,4);
       list.display();
       list.duplicate();
       LinkedList list1=new LinkedList();
       list1.InsertLast(1);
        list1.InsertLast(1);
        list1.InsertLast(2);
        list1.InsertLast(3);
        list1.InsertLast(3);
        list1.InsertLast(3);
        list1.display();
        list1.duplicate();
        list1.display();

    }


}
