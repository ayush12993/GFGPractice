package com.gfg.queue.numberofsiblingofagivennode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class GFG {
    static class Node{
        int key;
        Vector<Node> child;
        Node(int data){
            key = data;
            child = new Vector<Node>();
        }
    }

    static int numberOfSibling(Node root,int x){
        if (root==null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.size()>0){
            Node p = q.peek();
            q.remove();
            for (int i=0;i<p.child.size();i++){
                if (p.child.get(i).key==x)
                    return p.child.size()-1;
                q.add(p.child.get(i));
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Node root = new Node(50);
        (root.child).add(new Node(2));
        (root.child).add(new Node(30));
        (root.child).add(new Node(14));
        (root.child).add(new Node(60));
        (root.child.get(0).child).add(new Node(15));
        (root.child.get(0).child).add(new Node(25));
        (root.child.get(0).child.get(1).child).add(new Node(70));
        (root.child.get(0).child.get(1).child).add(new Node(100));
        (root.child.get(1).child).add(new Node(6));
        (root.child.get(1).child).add(new Node(1));
        (root.child.get(2).child).add(new Node(7));
        (root.child.get(2).child.get(0).child).add(new Node(17));
        (root.child.get(2).child.get(0).child).add(new Node(99));
        (root.child.get(2).child.get(0).child).add(new Node(27));
        (root.child.get(3).child).add(new Node(16));

           int x = 100;

         System.out.println( numberOfSibling(root, x) );
    }
}
