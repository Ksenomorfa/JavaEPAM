package ru.polinabevad.javarecall.epam;

/**
 * Created by Ksenomorfa on 3/12/2017.
 */
public class TestPriority {
    public static void main(String[] args) {
        int i = 3;
        int k=0;
        int j=0;
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
    }

}
