package ru.polinabevad.javarecall.epam;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        EPAMHomework11 obj = new EPAMHomework11();
        obj.Hello();
        for(int i=0;i<args.length;i++) {
            System.out.println("Аргумент " + i + "=" + args[i]);
        }
    }
}
