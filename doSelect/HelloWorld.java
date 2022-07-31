package com.doSelect;

public class HelloWorld{
    Integer x;
    public static void main(String []args){
        new HelloWorld().get(5);
    }
    void get(Integer i){
        System.out.println(x + ++i);
    }
}