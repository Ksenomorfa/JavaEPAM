package ru.polinabevad.javarecall.testing.module2;

import java.util.Date;

public class TestMain {
    private int x=1;

    public static void main(String[] args) {
        TestMain testMain = new TestMain();
        testMain.x=3;
        Date date2  = new Date();
        testMain.print();
        System.out.println(date2.toString());
    }
    private Date date  = new Date() {
        @Override
        public String toString() {
            return "1 2 3";
        }

    };

    void print() {
        System.out.println(date.toString());
    }

    Runnable date2 = () -> System.out.println(toString());

}
