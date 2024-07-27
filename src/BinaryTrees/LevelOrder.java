package BinaryTrees;


import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {


    public void LevelOrder(Node5 root){
        Queue<Node5> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node5 cur=q.poll();
            System.out.println(cur.data);
            if(cur.left!=null){
                //q.add(cur.left);
            }
            if(cur.right!=null){
               // q.add(cur.right);
            }


        }
    }

    public static void main(String[] args) {

    }
}
class Node5{
    int data;
    Node left,right;
     Node5(int key){
         data=key;
     }

}
