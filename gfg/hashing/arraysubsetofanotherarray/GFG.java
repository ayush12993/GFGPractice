package com.gfg.hashing.arraysubsetofanotherarray;

import java.util.HashMap;
import java.util.Map;

public class GFG {
    public static String subsetArr(int[] arr1,int[] arr2){
        int n;
        Map<Integer,Integer> arrhash1 = new HashMap<>();
         for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    arrhash1.put(j,arr2[j]);
                }
            }
        }

         if (arrhash1.size()==arr2.length){
             return "arr2[] is a subset of arr1[]";
         }
        return "arr2[] is not a subset of arr1[] ";
    }

    public static void main(String[] args) {
        System.out.println(subsetArr(new int[]{1,3,4,5},new int[]{3,4,5}));
    }
}
