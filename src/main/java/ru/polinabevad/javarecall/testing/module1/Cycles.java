package ru.polinabevad.javarecall.testing.module1;


public class Cycles {
    public static void main(String[] args) {
        int a = 10;
        while (true) {

            if (a < 20) {
                a++;
            }
            break;
        }
        System.out.println(a);

        int i = 1;
        Outer:
        for(int j=0; j<10;j++) {
            for(int k=0; k<5;k++) {
                a=2+k;
                System.out.print(" a = " + a + " k = " + k);
                if (a==5) break Outer;
            }
            System.out.println();
        }

        Homework11 q1 = new Homework11();
        if (q1 instanceof LoseAccuracy) {
            System.out.println("a= " + Homework11.a);
        }
        System.out.println();
        int matr[] = {1, 2, 35, 67};
        for (int l: matr) {
            System.out.println(l);
        }
    }
}
