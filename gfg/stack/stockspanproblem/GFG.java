package com.gfg.stack.stockspanproblem;

import java.util.Arrays;

public class GFG {

    static void calculateSpan(int[] arr, int n, int[] S) {
        S[0] = 1;
        for (int i = 1; i < n; i++) {
            S[i] = 1;
            for (int j = i - 1; j >= 0 && arr[i] >= arr[j]; j--) {
                S[i]++;
            }
        }
    }

    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] price = {10, 4, 5, 90, 120, 80};
        int n = price.length;
        int S[] = new int[n];

        // Fill the span values in array S[]
        calculateSpan(price, n, S);

        // print the calculated span values
        printArray(S);
    }
}
