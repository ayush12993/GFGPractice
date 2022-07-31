package com.geeksforgeeks.companywise.google.subarray;

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args) {

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(new int[]{1, 2, 3, 7, 5}, 5, 12);
                System.out.print(res);

    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
    int i=0,j=0,currs=0;
    ArrayList<Integer> tempL = new ArrayList<>();
    while(i<n){
        currs = currs+arr[i];
           while (currs>s && j<i){
               currs= currs-arr[j];
               j++;
           }
           if (currs == s){
               tempL.add(j+1);
               tempL.add(i+1);
               break;
           }
        i++;
    }
    if (tempL.size()==0){tempL.add(-1);}
    return tempL;
    }
}
