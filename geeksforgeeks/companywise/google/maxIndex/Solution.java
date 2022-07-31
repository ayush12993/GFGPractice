package com.geeksforgeeks.companywise.google.maxIndex;

//{ Driver Code Starts
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class Main {

    public static void main (String[] args) throws IOException {

        Solution ob = new Solution();

        System.out.println(ob.maxIndexDiff(new int[]{82, 63, 44, 74, 82, 99, 82}, 7)); // print the result

    }
}
// } Driver Code Ends


class Solution{

    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) {

        int i=0,k=0,m=0;
        while (i<N){
            int j=0;
            while (j<N){
                k = A[j] - A[i];
                if (k>0 && j-i >m) {
                    m = j-i;
                }
                j++;
            }
            i++;
        }
return m;
    }
}


