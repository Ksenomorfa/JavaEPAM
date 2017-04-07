package ru.polinabevad.javarecall.testing.module2;

public class PersonUse{
    public static void main(String[] args) {

        Person person1 = new Person("Polina", "Bevad",30);
        Person person2 = new Person("Elina", "Bevad",29);
        System.out.println(person1.getAge());
        System.out.println(person1.compareTo(person2));
    }
}
