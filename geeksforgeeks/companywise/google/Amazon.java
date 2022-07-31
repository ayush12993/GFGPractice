package com.geeksforgeeks.companywise.google;


import java.util.*;
class Amazon {
    public static int minOperations(int awards[],
                                    int n, int k)
    {
      Arrays.sort(awards);
      int i=1,group_count=1;
      int min_element = awards[0];
       while (i<n){
           if (awards[i]-min_element<=k){
               i++;
           }
           else {
               group_count++;
               min_element = awards[i];
               i++;
           }
       }
        return group_count;
    }

    public static void main(String[] args)
    {
        int[] arr = new int[]{1,13, 6,8,9, 3, 5};
        int n = arr.length;
        int k = 4;

        System.out.print(minOperations(arr, n, k));
    }
}


