package ru.polinabevad.javarecall.eckel.chapter2;

public class Exc1 {
    private int i;
    private char c;
    private Exc1() {
        System.out.println("c = " + c);
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        new Exc1();
    }
}



