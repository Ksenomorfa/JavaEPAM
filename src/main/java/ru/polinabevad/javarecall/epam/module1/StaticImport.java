package ru.polinabevad.javarecall.epam.module1;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


class StaticImport {
   private int i =20;

    strictfp void staticImport() {
        double x;
        x = pow(i,2.023165)*PI;
        System.out.println("x= " +x);
    }
}
