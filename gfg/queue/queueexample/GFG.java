package com.gfg.queue.queueexample;

import java.util.LinkedList;
import java.util.Queue;

public class GFG {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0;i<=5;i++){
            queue.add(i);
        }
        System.out.println("Queue of element is : "+queue);

        queue.remove();

        System.out.println("After removing queue is : "+queue);
        System.out.println("Head of queue is : "+queue.peek());
        System.out.println("Size of queue is : "+queue.size());
    }
}
