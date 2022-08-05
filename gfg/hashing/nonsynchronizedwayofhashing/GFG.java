package com.gfg.hashing.nonsynchronizedwayofhashing;

import java.util.HashMap;

public class GFG {
    static void createHashMap(int []arr){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            Integer c = hashMap.get(arr[i]);
            if (hashMap.get(arr[i])==null)
                hashMap.put(arr[i],1 );
            else
                hashMap.put(arr[i],++c );
        }
        System.out.println(hashMap);
    }
    public static void main(String[] args)
    {
        int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
        createHashMap(arr);
    }
}
