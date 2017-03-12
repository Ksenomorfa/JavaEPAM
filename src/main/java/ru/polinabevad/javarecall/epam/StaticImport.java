package ru.polinabevad.javarecall.epam;
import static java.lang.Math.pow;
import static java.lang.Math.PI;

/**
 * Created by Ksenomorfa on 3/12/2017.
 */
public class StaticImport {
    private int i =20;

    public void staticImport() {
        double x;
        x = pow(i,2)*PI;
        System.out.println("x= " +x);
    }
}
