package ru.polinabevad.javarecall.epam;

/**
 * Created by Polina on 3/12/2017.
 */
public class TestPriority {
    public static void main(String[] args) {
        int i=3;
        i = -i++ + i++ + -i;
        System.out.println("i = " + i);
    }

}
