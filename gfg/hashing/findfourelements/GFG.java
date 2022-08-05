package com.gfg.hashing.findfourelements;

import java.util.*;

public class GFG {
    public static void getFourElements(int[] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                arrayList.add(arr[i]+arr[j]);
            }
        }
        System.out.println(List.of(arrayList));
    }

    public static void main(String[] args) {
        getFourElements(new int[]{3, 4, 7, 1, 2, 9, 8});
    }
}
