package com.doSelect;

class Hello
{
    public static void main(String args[])
    {
        try
        {
            int a = args.length;
            int b = 10 / a;
            System.out.print(a);
        }
        catch (ArithmeticException e)
        {
            System.out.println("1");
        }
    }
}