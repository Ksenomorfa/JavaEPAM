package ru.polinabevad.javarecall.testing.module2;

public class F{

    static int a = 1111;
    static
    {
        int b = a--;
        int c = --a;
        a = b-c;
    }

    {
        a = a++ + ++a;
    }

    public static void main(String[] args)  {
        System.out.println(a);
    }
}