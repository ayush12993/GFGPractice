package com.leetcode.node;

 class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class Test {
    public static void main(String[] args) {
        Node head = null;
        head = print(head,30);
        head = print(head,40);
        head = print(head,50);
        System.out.println(
                head
        );
    }

    public static Node print(Node head,int x) {
      Node temp = new Node(x);
      temp.next = head;
      return  head;
    }
}
