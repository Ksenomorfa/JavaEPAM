package ru.polinabevad.javarecall.epam;

public class TestPriority {
    public static strictfp void main(String[] args) {
        int i = 3;
        int k;
        int j;
        int g = 1;
        System.out.println(g++ + ". " + (j = -i++) );
        System.out.println(g++ + ". "+  +i);
        System.out.println(g++ + ". " + (k = i++));
        System.out.println(g++ + ". " + i);
        System.out.println(g++ + ". " +-i);
        System.out.println(g++ + ". " +i);
        System.out.println(g++ + ". " +((j + k - i)== -4));

        StaticImport n= new StaticImport();
        n.staticImport();
        float f = (float)(2.0/1.1);
        System.out.println(g++ + ". f= " + f);
        double f2 = (2.0/1.1);
        System.out.println(g++ + ". f= " + f2);
    }

}
