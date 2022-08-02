package com.gfg.stack.areBracketsBalanced;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {
    static boolean areBalancedBrackets(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case '(', '{', '[' -> {
                    stack.push(ch);
                    continue;
                }
                case ' ' -> {
                    return false;
                }
            }

            char check;
            switch (ch) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '}' || check == ']') {
                        return false;
                    }
                    break;
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == ')' || check == ']') {
                        return false;
                    }
                    break;
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '}' || check == ')') {
                        return false;
                    }
                    break;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "([{}])";

        // Function call
        if (areBalancedBrackets(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
