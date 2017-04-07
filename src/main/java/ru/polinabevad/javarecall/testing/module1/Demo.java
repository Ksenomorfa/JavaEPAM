package ru.polinabevad.javarecall.testing.module1;


import java.util.Date;

class Vehicle{
    public static void  kmToMiles(int km){
        System.out.println("Внутри родительского класса/статического метода");
    }
}

class Car extends Vehicle{
    public static void  kmToMiles(int km){
        System.out.println("Внутри дочернего класса/статического метода ");
    }
}

public class Demo{
    public static void main(String args[]){
        Vehicle v = new Car();
        v.kmToMiles(10);
        Book book = new Book("Java");
        System.out.println(book.getTitle());
        Date myDatr = new Date();
        //System.out.println("Before:" + myDatr.getDate());
        changeDate(myDatr);
        //System.out.println("After:" + myDatr.getDate());
        String str = new String("I like");
        str="New";
        System.out.println(str);
        changeString(str);
        System.out.println(str);
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1==s2);
        s1+=2;
        System.out.println(s1 + s2);
        System.out.println(s1==s2);
        s2 = new String(s1);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }

    private static void changeString(String str) {
        System.out.println(str);
        str="I like Java";
        System.out.println(str);

    }

    private static void changeDate(Date date) {
        //System.out.println(" - before change" + date.getDate());
        //date.setDate(12);
        //System.out.println(" - after change" + date.getDate());
    }
}
