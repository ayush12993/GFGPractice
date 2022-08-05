package com.gfg.hashing.treesetworking;

import java.util.Iterator;
import java.util.TreeSet;

public class GFG {
    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<>();
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
        ts1.add("C");
        System.out.println("Treeset is : "+ts1+
                "\nTreeset contains A or not: "+ts1.contains("A"));

        System.out.println("\nAfter passing remove does element A gets removed "+ts1.remove("A")+"\nNew Treeset wil be like : "+ts1+" \n\nIteratong over TreeSet");
        Iterator<String> i = ts1.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
