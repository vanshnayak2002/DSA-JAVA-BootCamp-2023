package BinaryTrees;

public class Sizeofnodes {
     Node4 root;

     int getSize(){return getSize(root);}
    int getSize(Node4 node){
       if(node==null)
           return 0;
       return getSize(node.left)+getSize(node.right)+1;
   }

    public static void main(String[] args) {
        Sizeofnodes tree=new Sizeofnodes();
        tree.root=new Node4(1);
        tree.root.left=new Node4(2);
        tree.root.right=new Node4(3);
        tree.root.left.left=new Node4(4);
        tree.root.left.right=new Node4(5);
        System.out.println("No. of nodes is:" +tree.getSize());

    }


}
class Node4{
    int data;
    Node4 left;
    Node4 right;
   public Node4(int key){
        data=key;

   }
}