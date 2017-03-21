package ru.polinabevad.javarecall.epam.module2;

import java.util.Objects;

public class StaticBlock implements Cloneable {
    public static double increase= 2.5;
    // static блоки - это замена конструктора для static полей
    //increase = 1.5; //так нельзя
    static {
      increase = 1.5;
    }
    static final int nim = 1;
    //nim = 2;
    int x = 10;

    {
        x = 65;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        StaticBlock staticBlock = new StaticBlock();
        System.out.println(staticBlock.increase + " " + staticBlock.toString());
        StaticBlock staticBlock1 = (StaticBlock)staticBlock.clone();
        System.out.println(staticBlock1.increase + " " + staticBlock1.toString());
    }
}
