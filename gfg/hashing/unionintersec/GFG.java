package com.gfg.hashing.unionintersec;

import java.util.HashSet;
import java.util.LinkedList;


public class GFG {


public static HashSet<Integer> intersection(LinkedList<Integer> list1, LinkedList<Integer> list2){
    HashSet<Integer> hashSet = new HashSet<>();
    for (int i=0;i<list1.size();i++){
        for (int j=0;j<list2.size();j++){
        if (list1.get(i).equals(list2.get(j))){
            hashSet.add(list2.get(j));
          }}
    }
    return hashSet;
}

public static HashSet<Integer> union(LinkedList<Integer> list1, LinkedList<Integer> list2){
    HashSet<Integer> hashSet = new HashSet<>();
    for (int i=0;i<list1.size();i++){
        for (int j=0;j<list2.size();j++){
        if (!list1.get(i).equals(list2.get(j))){
            hashSet.add(list2.get(j));
            hashSet.add(list1.get(i));
          }}
    }
    return hashSet;
}

    public static void main(String[] args) {

    LinkedList<Integer> list1 = new LinkedList<>(),list2=new LinkedList<>();

    list1.add(10);
    list1.add(15);
    list1.add(4);
    list1.add(20);


    list2.add(8);
    list2.add(4);
    list2.add(2);
    list2.add(10);
        System.out.println(intersection(list1,list2));
        System.out.println(union(list1,list2));

    }
}
