package ru.polinabevad.javarecall.epam.module2;

public class Classes {
    public Classes() {}
    void m1(A a) {
        System.out.println("A");
    }
    void m1(B b) {
        System.out.println("B");
    }
    void m1(C c) {
        System.out.println("C");
    }
    void m1(D d) {
        System.out.println("D");
    }

    public static void main(String[] args) {
        //new Classes().m1(null);
    }
}

class A {}
class B extends A {}
class C extends B{}
class D extends A{}

