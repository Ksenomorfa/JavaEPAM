package ru.polinabevad.javarecall.epam.module2;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Person anotherPerson) {
        int anotherPersonAge = anotherPerson.getAge();
        return this.age - anotherPersonAge;
    }


}
