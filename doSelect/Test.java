package com.doSelect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class A
{
void m1() throws ArrayIndexOutOfBoundsException
{
    System.out.println("In m1 A");
}
}
class B extends A
{
void m1() throws IndexOutOfBoundsException
{
    System.out.println("In m1 B");
}
}
public class Test {

public static void main(String[] args) {
    String str1 = "abc";
    String str2 = new String("abc");
    if (str1.equals(str2)){
        System.out.println("SS");
    }
}
}