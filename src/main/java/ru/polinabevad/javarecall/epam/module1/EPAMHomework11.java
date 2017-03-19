package ru.polinabevad.javarecall.epam.module1;

import ru.polinabevad.javarecall.epam.module1.AboutJava;
import ru.polinabevad.javarecall.epam.module1.HelloWorld;

public class EPAMHomework11 extends LoseAccuracy {
    private int i0;

    public void Hello (){
            System.out.println("Hello, World2!");
    }
    public static void main(String []args){
        AboutJava ab = new AboutJava();
        String s1 = ab.getAboutJava();
        HelloWorld ma = new HelloWorld(1);
        System.out.println(ma.getAboutJava());
        int maxint=Integer.MAX_VALUE;
        int minint=Integer.MIN_VALUE;
        byte maxbyte=Byte.MAX_VALUE;
        byte minbyte=Byte.MIN_VALUE;
        short maxshort=Short.MAX_VALUE;
        short minshort=Short.MIN_VALUE;
        long maxlong=Long.MAX_VALUE;
        long minlong=Long.MIN_VALUE;
        float maxfloat;
        maxfloat = Float.MAX_VALUE;
        float minfloat = Float.MIN_VALUE;
        double maxdouble = Double.MAX_VALUE;
        double mindouble = Double.MIN_VALUE;
        char maxchr=Character.MAX_VALUE;
        char minchr=Character.MIN_VALUE;
        boolean h=Boolean.FALSE;
        byte byteVar2=123;
        int var1=100;
        long long1=1_000_000_000L;
        int var2=1_000_000_000;
        var1+=long1;
        //var1 = var1+long1;
        System.out.println(var1 + " " + var2);
        System.out.println(maxint + " " + minint);
        System.out.println(maxbyte + " " + minbyte);
        System.out.println(maxshort + " " + minshort);
        System.out.println(maxlong + " " + minlong);
        System.out.println(maxfloat + " " + minfloat);
        System.out.println(maxdouble + " " + mindouble);
        System.out.println(maxchr + " " + minchr);
        System.out.println(h);
        
    }
    void hello(){
        System.out.println("Hello, World2!");
        System.out.println(i0);
    }
}