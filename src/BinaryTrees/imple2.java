package BinaryTrees;

import java.util.Scanner;


public class imple2 {
  static  Scanner sc=null;//initial null and making obkect sc of Scnner class
    public static void main(String[] args) {
      sc=new Scanner(System.in);
      createTree();//calling a recursive function
    }

static Node1 createTree(){

        Node1 root=null;

    System.out.println("Enter data: ");//root data
      int data=sc.nextInt();
     if(data==-1)return null;
     root=new Node1(data);
    System.out.println("Enter left for" + data);
     root.left= createTree();
    System.out.println("Enter right for"+ data);
     root.right=createTree();

        return root;
    }



}//Basic structure of BInary tree
class Node1{
    int data;
    Node1 right;
    Node1 left;
 Node1(int key){
     int data=key;
 }
}
