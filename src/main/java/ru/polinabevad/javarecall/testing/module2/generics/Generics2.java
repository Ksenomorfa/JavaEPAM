package ru.polinabevad.javarecall.testing.module2.generics;

public class Generics2 {

    public static <Type> void method(Type obj) {
        System.out.println("void generic");
    }

    public static void method(Number obj) {
        System.out.println("void number");
    }

    public static void method(Integer obj) {
        System.out.println("void integer");
    }
    public static void method(String obj) {
        System.out.println("void string");
    }

    public static void main(String[] args) {
        method(10);
        method("");
        method("123");

    }
}
