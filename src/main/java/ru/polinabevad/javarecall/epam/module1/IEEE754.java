package ru.polinabevad.javarecall.epam.module1;


public class IEEE754 {
    public static strictfp void main(String[] args) {
        double i = 8.0;
        double k;
        System.out.println(i / 0);
        System.out.println(-i / 0);
        System.out.println();
        System.out.println(k = Math.sqrt(-i));
        System.out.println(Double.isNaN(k));

    }
}
