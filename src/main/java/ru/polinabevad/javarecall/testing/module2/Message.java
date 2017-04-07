package ru.polinabevad.javarecall.testing.module2;

public class Message <T1,T2> {
    T1 id;
    T2 name;

    public static void main(String[] args) {
        Message <Integer, String>  ob = new Message<Integer,String>();
    }

}
