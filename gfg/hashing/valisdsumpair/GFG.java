package com.gfg.hashing.valisdsumpair;

import java.util.HashSet;

public class GFG {
    public static boolean addTwoNum(int []arr, int x){

        for (int i=1;i< arr.length;i++){
           int k =arr[i-1]+arr[i];
           if (k==x){
               System.out.println("Pair with a given sum "+x+" is ("+arr[i-1]+" , "+arr[i]+")");
                return true;
           }
        }
        return false;
    }

    public static void main(String[] args) {
        int x=5;
        if (addTwoNum(new int[]{1, -2, 1, 0, 5},x)){
            System.out.println("Valid pair exists");
        }else {
            System.out.println("No valid pair exists for "+x);
        }
    }
}
