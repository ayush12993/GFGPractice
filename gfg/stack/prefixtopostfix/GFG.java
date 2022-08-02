package com.gfg.stack.prefixtopostfix;

import java.util.Stack;

class GFG {
    static boolean isOperator(char ch) {
        return switch (ch) {
            case '+', '-', '*', '/' -> true;
            default -> false;
        };
    }

    static String postToPre(String str) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (isOperator(str.charAt(i))) {
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();
                String temp = str.charAt(i) + op2 + op1;
                stack.push(temp);
            } else {
                stack.push(str.charAt(i) + "");
            }
        }
        StringBuilder ans = new StringBuilder();
        for (String i : stack)
            ans.append(i);
        return ans.toString();
    }

    public static void main(String args[]) {
        String post_exp = "ABC/-AK/L-*";

        System.out.println("Prefix : "
                + postToPre(post_exp));
    }
}