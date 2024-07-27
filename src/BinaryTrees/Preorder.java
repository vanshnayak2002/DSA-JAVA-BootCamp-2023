package BinaryTrees;

public class Preorder {
    static class Node2 {
        Node2 left;
        Node2 right;
        int value;


        public Node2(int key) {
            int value = key;
        }
    }



    public static void main(String[] args) {
        Node2 root=new Node2(2);
         root.left= new Node2(3);
         root.right=new Node2(4);
        root.left.left= new Node2(3);
        root.right.right=new Node2(4);
        root.left.right= new Node2(3);
        root.right.left=new Node2(4);

    }

}




