package com.geeksforgeeks.companywise.google.LongestParanthesis;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {


            Solution ob = new Solution();
            System.out.println(ob.maxLength("((()"));

    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String str){
        // code here
        char[] ch = new char[str.length()];

        // Copying character by character into array
        // using for each loop
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        // Printing the elements of array
        // using for each loop
        for (char c : ch) {

            System.out.println(c);
        }
        return 1;
    }
}