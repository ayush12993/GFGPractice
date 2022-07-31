package com.gfg.stack.queueusingstack;

import java.util.Queue;
import java.util.Stack;

class GFG{
 static class Queue{
     Stack<Integer> stack1;
     Stack<Integer> stack2;
 }

 static void push(Stack<Integer> stack,int x){
     stack.push(x);
 }

 static int pop(Stack<Integer> stack){
     return stack.pop();
 }

 static void enqueue(Queue queue,int x){
     push(queue.stack1,x);
 }

 static int dequeue(Queue queue){
     int x;
     if (queue.stack2.isEmpty()){
         while (!queue.stack1.isEmpty()){
             x= pop(queue.stack1);
             push(queue.stack2,x);
         }
     }
     x=pop(queue.stack2);
     return x;
 }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.stack1 = new Stack<>();
        queue.stack2 = new Stack<>();
        for (int i=0;i<4;i++){
            enqueue(queue,i);
            System.out.println(dequeue(queue));
        }
    }
}

