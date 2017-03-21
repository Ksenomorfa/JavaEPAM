package ru.polinabevad.javarecall.epam.module2;

public class ConstructorThis {
    private int x;
    private int y;

    public ConstructorThis(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x: " + this.x + " y: " + this.y);
    }

    public ConstructorThis(int size) {
        //перед this() нельзя ничего писать, должным быть первым для вызова
        //из одного конструктора другого
        this(size, size);
    }

    public static void main(String[] args) {
        ConstructorThis cons = new ConstructorThis(10);
    }
}
