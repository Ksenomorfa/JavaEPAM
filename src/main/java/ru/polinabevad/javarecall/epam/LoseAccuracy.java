
package ru.polinabevad.javarecall.epam;

public class LoseAccuracy {
    public static void main(String[] args){
     
        int x1 = 123456789;
        int x2 = 99999999;
        float f3 = x1;
        float f4 = x2;
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        
        float f1 = 1.2345f;
        double d1 = f1;
        double d2 = 1.2345;
        
        System.out.println("f1 = " + f1);
        System.out.println("d1 = " + d1);
        System.out.printf("f1 = %.16f\n", f1);
        System.out.printf("d2 = %.16f\n",d2);
        
        long l1 = 1234567891234031154L;
        float f2=l1;
        System.out.println("f2 = " + f2);
        System.out.println("l1 = " + l1);
        
        int value2 = (int)l1;
        System.out.println("value2 = " + value2);
        double value3=(double)l1;
        System.out.printf("value3 = %20.20f\n", value3);
        
        long a = 10_000_000_000L;
        int x;
        x=(int)a;
        System.out.println("x = " + x);
        
        byte b5=50;
        byte b4=(byte)(b5*2);
        System.out.println("b4 = " + b4);
        byte b1= 50, b2=20, b3=127;
        int x5=b1*b2*b3;
        System.out.println("x5 = " + x5);
        
        double d5=12.34;
        int x3;
        x3=(int)d5;
        System.out.println("x3 = " + x3);
    }
}
