
package ru.polinabevad.javarecall.testing.module1;

public class TestObjectParam {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        System.out.println("i1=" + i);
        changeIntegerWithoutReturn(i);
        System.out.println("i2=" + i);
        i = changeInteger(i);
        System.out.println("i3=" + i);
    }

    private static int changeInteger(Integer x) {
        System.out.println("x1=" + x);
        x=20;
        System.out.println("x2=" + x);
        return x;
    }
    
    private static void changeIntegerWithoutReturn(Integer x) {
        System.out.println("x1=" + x);
        x=20;
        System.out.println("x2=" + x);
    }
}
