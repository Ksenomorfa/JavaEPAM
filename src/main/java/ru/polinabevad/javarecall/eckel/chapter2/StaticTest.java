
package ru.polinabevad.javarecall.eckel.chapter2;

class StaticTest {
    static int i =47;
    
    public static void main(String[] args) {
        Incrementable in = new Incrementable();
        in.increment();
        Incrementable.increment();
        System.out.println(StaticTest.i);
        StaticTest s1 = new StaticTest();
        StaticTest s2 = new StaticTest();
        in.increment();
        System.out.println(s1.i + " "+ s2.i);
    }
}
