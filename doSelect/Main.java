package com.doSelect;

public class Main {
    {
        System.out.println("Instance Block");
    }
    public void meth()
    {
        System.out.println("Method");
    }
    public void Main()
    {
        System.out.println("Constructor");
    }
    static {
        System.out.println("static block");
    }
    public static void main(String[] arg) {
        Main ob = new Main();
        ob.Main();
        ob.meth();
    }
}