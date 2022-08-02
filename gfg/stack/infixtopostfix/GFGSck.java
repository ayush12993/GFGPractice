package com.gfg.stack.infixtopostfix;

import java.util.Stack;

class GFGSck {
    static int Prec(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    static StringBuilder postfixToInfix(String exp) {
        StringBuilder result = new StringBuilder("");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() &&
                        stack.peek() != '(')
                    result.append(stack.pop());

                stack.pop();
            } else {
                while (!stack.isEmpty() && Prec(ch) <= Prec(stack.peek()))
                    result.append(stack.pop());
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return new StringBuilder("Invalid Expression");
            result.append(stack.pop());
        }
        return result;
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(postfixToInfix(exp));
    }
}

