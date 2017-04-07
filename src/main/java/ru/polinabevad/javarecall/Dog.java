package ru.polinabevad.javarecall;

import java.io.Reader;

public class Dog {
    private String name;

    public static void main(String[] args) {
        Dog myDog = new Dog("Rover");
        foo(myDog);
        System.out.println(myDog.name);
    }

    Dog(String name)
    {
        this.name = name;
    }
    static void foo(Dog someDog) {
        someDog.setName("Max");     // AAA
        someDog = new Dog("Fifi");  // BBB - новая ссылка внутри метода,
        // изначальный объект о ней не знает
        someDog.setName("Rowlf");   // CCC
    }

    void setName(String name) {
        this.name = name;
    }
}
