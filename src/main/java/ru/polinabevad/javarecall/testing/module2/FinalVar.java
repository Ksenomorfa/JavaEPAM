package ru.polinabevad.javarecall.testing.module2;

import java.util.Date;

public class FinalVar {
    private final int finalVar = 5;
    private final Date date2;

    public FinalVar() {
        date2 = new Date();
    }

    public static final int staticFinalVar = 10;
    private final Date date = new Date();

    public static void main(String[] args) {

        final int tmp = 12;
    }
}
