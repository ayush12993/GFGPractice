package com.gfg.stack.stackwithoperwithmddl;

class DLLNode {
    DLLNode prev;
    int data;
    DLLNode next;

    DLLNode(int data) {
        this.data = data;
    }
}

public class myStack {
    DLLNode head;
    DLLNode mid;
    DLLNode prev;
    DLLNode next;
    int size;

    void push(int new_data) {
        DLLNode new_node = new DLLNode(new_data);

        if (size == 0) {
            head = new_node;
            mid = new_node;
            size++;
            return;
        }

    }

}
