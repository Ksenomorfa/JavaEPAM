package ru.polinabevad.javarecall.epam.module2;

import java.util.Date;

public class TestMain {
    int x=1;

    public static void main(String[] args) {
        TestMain testMain = new TestMain();
        testMain.x=3;
        Date date2  = new Date();
        testMain.print();
        System.out.println(date2.toString());
    }
    Date date  = new Date() {
        @Override
        public String toString() {
            return "1 2 3";
        }

    };

    void print() {
        System.out.println(date.toString());
    }

}
