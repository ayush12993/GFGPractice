package com.geeksforgeeks.companywise.google.nonrepeatingnumber;

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.IntStream;

class GFG
{
    public static void main(String[] args) throws IOException
    {

            Solution ob = new Solution();
            int[] ans = ob.singleNumber(new int[]{1, 2, 3, 2, 1, 4});
            for (int i=0;i<ans.length;i++){
                System.out.println(ans[i]);
            }

    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int i=0;
     TreeMap<Integer,Integer> maps = new TreeMap<>();
     while (i< nums.length){
         if (maps.containsKey(nums[i]))
             maps.remove(nums[i]);
         else  {
             maps.put(nums[i],1 );
         }
         i++;
     }
        return new int[]{maps.firstKey(),maps.lastKey()};
    }
}
