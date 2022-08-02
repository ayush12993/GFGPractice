package com.gfg.stack.maximumproductofnextgreaterleftandright;

import java.util.Map;
import java.util.Stack;

public class GFG {

  static int MAX =100;

  static int[] left_sum(int[] arr,int n){
      int[] left_index = new int[arr.length+1];
      Stack<Integer> stack =new Stack<>();
      for (int i=n-1;i>=0;i--){
          while (stack.size()!=0 && arr[i]>arr[stack.peek()-1]){
              int r = stack.peek();
              stack.pop();
              left_index[r-1]=i+1;
          }
          stack.push(i+1);
      }
      return left_index;
  }

    static int[] right_sum(int[] arr,int n){
        int[] right_index = new int[arr.length+1];
        Stack<Integer> stack =new Stack<>();
        for (int i=0;i<n;i++){
            while (stack.size()!=0 && arr[i]!=arr[stack.peek()-1]){
                int r = stack.peek();
                stack.pop();
                right_index[r-1]=i+1;
            }
            stack.push(i+1);
        }
        return right_index;
    }
    static int sum(int []arr,int n){
      int[] left = left_sum(arr,n);
      int[] right = right_sum(arr,n);

      int ans = -1;

      for (int i=0;i<n;i++)
          ans = Math.max(ans,left[i]*right[i]);
      return ans;
    }
    public static void main(String args[])
    {
        int []arr = new int[]{ 5, 4, 3, 4, 5 };
        int n = arr.length;

        System.out.print(sum(arr, n));
    }
}
