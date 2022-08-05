package com.gfg.hashing.hashtable;

import java.util.Hashtable;

public class GFG {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm = new Hashtable<>();
        hm.put(1,"Geeks");
        hm.put(3,"Geeks");
        hm.put(2,"For");
        System.out.println(hm.get(1)+hm.get(2)+hm.get(3));
    }
}
