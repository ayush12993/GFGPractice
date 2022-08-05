package com.gfg.queue.queuesortedintoanotherqueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GFG {

    static Queue<Integer> q = new ArrayDeque<>();

    static boolean checkSorted(int n){
        Stack<Integer> stack = new Stack<>();
        int expected = 1;
        int fnt;
        while (q.size()!=0){
            fnt = q.peek();
            q.poll();
            if (fnt==expected)
                expected++;
            else {
                if (stack.size()==0){
                    stack.push(fnt);
                } else if (stack.peek()<fnt) {
                    return false;
                }
                else stack.push(fnt);
            }
            while (stack.size()!=0 && stack.peek() == expected){
                stack.pop();
                expected++;
            }
        }
        return expected - 1 == n && stack.size() == 0;
    }

    public static void main(String[] args)
    {
        q.add(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        int n = q.size();

        if (checkSorted(n))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
