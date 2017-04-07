package ru.polinabevad.javarecall.testing.module2;

public class Mathemaica {
    public Mathemaica(Num obj){
        System.out.println(1);
    }
    public Mathemaica(Int obj){
        System.out.println(2);
    }
    public Mathemaica(Num obj, Int obj2){
        System.out.println(3);
    }
    public Mathemaica(Int obj, Int obj2){
        System.out.println(4);
    }

    public static void main(String[] args) {
        Num o1 = new Num();
        Int o2 = new Int();
        LongInt o3 = new LongInt();
        Num o4 = new Int();

        Mathemaica m1 = new Mathemaica(o1);
        Mathemaica m2 = new Mathemaica(o2);
        Mathemaica m3 = new Mathemaica(o3);
        Mathemaica m4 = new Mathemaica(o4);
        Mathemaica m5 = new Mathemaica(o1,o2);
        Mathemaica m6 = new Mathemaica(o3,o2);
       // Mathemaica m7 = new Mathemaica(o1,o4);
       // Mathemaica m8 = new Mathemaica(o3,o4);

    }

}

class Num {}

class Int extends Num {}
class LongInt extends Int {}
