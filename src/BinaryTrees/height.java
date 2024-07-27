package BinaryTrees;

public class height {
   Node3 root;
    int maxDepth(Node3 node)
    {
        if (node == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    public static void main(String[] args) {
        height tree = new height();
        tree.root=new Node3(1);
    tree.root.left=new Node3(2);
     tree.root.right=new Node3(3);
     tree.root.left.left=new Node3(4);
     tree.root.left.right=new Node3(5);
        System.out.println("Height of tree is "
                + tree.maxDepth(tree.root));
    }

}



class Node3{
    int data;
    Node3 left;
    Node3 right;
    Node3(int key){
        data=key;
    }
}