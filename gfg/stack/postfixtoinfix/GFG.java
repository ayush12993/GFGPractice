package com.gfg.stack.postfixtoinfix;

import java.util.Stack;

public class GFG {
    static boolean isOperator(char ch) {
        return switch (ch) {
            case '+', '-', '*', '/', '^', '%' -> true;
            default -> false;
        };
    }

    static String convert(String str) {
        String str1 = new String();
        Stack<String> stack = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (isOperator(ch)) {
                stack.push("(" + stack.pop() + ch + stack.pop() + ")");
            } else {
                stack.push(ch + "");
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "*-A/BC-/AKL";
        System.out.println("Infix : " + convert(exp));
    }
}
