package com.gfg.queue.levelorder;

class Node{
    int data;
    Node left,right;
    public Node(int item){
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
     Node root;
     public BinaryTree(){
         root = null;
     }

     void printLevelOrder(){
         int h = height(root);
         for (int i=0;i<=h;i++)
             printCurrentLevel(root,i);
     }

    private int height(Node root) {
        if (root== null)
            return 0;
        else {
            int lHeight= height(root.left);
            int rHeight= height(root.right);
            if (lHeight>rHeight)
                return (lHeight+1);
            else
                return (rHeight+1);
        }
    }

    void printCurrentLevel(Node root,int level){
         if (root==null)
             return;
         if (level==1)
             System.out.println(root.data);
         else if (level>1){
             printCurrentLevel(root.left,level-1);
             printCurrentLevel(root.right,level-1);
         }
    }
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is ");
                tree.printLevelOrder();
    }
}
