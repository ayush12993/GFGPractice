package com.leetcode.subarraywithksum;


import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1,4,7,8,4},5));
    }
    public static   int subarraySum(int[] nums, int k) {
        int t=0,count=0,temp=1;
        int[] sum = new int[nums.length+1];
          sum[0]=0;

          for (int i=1;i<nums.length;i++){
              t +=nums[i];
              sum[i]=t;
          }

          for (int start=0;start< nums.length-1;start++){
              for (int end = start+1;end<nums.length;end++){
                  if (sum[end]-sum[start]==k){
                      count+=temp;
                  }
              }
          }
        System.out.println(Arrays.toString(sum));
       return count;
    }
}

