package BinaryTrees;

public class implementation {

    public static void main(String[] args) {
          Node root=new Node(0);
          root.left=new Node(1);
          root.right=new Node(2);
          root.right.left=new Node(3);
        System.out.println(root.left);
    }
}
class Node {
    int value;
    Node right;
    Node left;

    public Node(int key) {
        value = key;
    }
}
