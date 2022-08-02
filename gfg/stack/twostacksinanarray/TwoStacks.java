package com.gfg.stack.twostacksinanarray;

public class TwoStacks {
    int size, top1, top2;
    int[] arr;

    TwoStacks(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
            System.out.println("pushed is  " + x);
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
            System.out.println("pushed is  " + x);
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
    }

    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            System.out.println("popped element from stack1 is " + x);
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;

    }

    int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            System.out.println("popped element from stack1 is " + x);
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;

    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);

        ts.pop1();
        ts.push2(40);
        ts.pop2();
    }
}
