package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node12 {
    int data;
    Node12 right;
    Node12 left;

    public Node12(int item) {
        data = item;
        left=right;
    }

}
 class BinaryTree {
    Node12 root;

    static void reverse(Node12 value) {
        Stack<Node12> st = new Stack<>();
        Queue<Node12> queue = new LinkedList<>();
        queue.add(value);
        while (!queue.isEmpty()) {
            Node12 nodedata = queue.poll();
            st.add(value);
            if (value.right != null) {
                queue.add(value.right);
            }
            if (value != null) {
                queue.add(value.left);
            }


        }
        while (!queue.isEmpty()) {
            System.out.println(st.pop() + "");
        }
    }


}



public class ReverseOrder {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node12(2);
        tree.root.left = new Node12(1);
        tree.root.right = new Node12(2);
        tree.root.right.left = new Node12(3);
        tree.root.right.right = new Node12(3);
        tree.reverse(tree.root);

    }
}






