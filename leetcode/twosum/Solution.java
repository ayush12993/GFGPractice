package com.leetcode.twosum;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,3}, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
            int i=0;
            while (i< nums.length){
                int l=i+1;
                while (l< nums.length){
                int k= nums[i]+nums[l];
                if (k==target){
                    return new int[]{i,l};
                }
                l++;
                }
                i++;
            }
            return null;
    }
}