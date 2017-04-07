package ru.polinabevad.javarecall.testing.module1;

public class InstanceOfClass {
    public static void main(String[] args) {
        doLogic(new BaseCourse());
        doLogic(new OptionalCourse());
        doLogic(new FreeCourse());
        doLogic(new Course());
    }
    private static void doLogic(Course c) {
        if (c instanceof BaseCourse) System.out.println("Base Course");
        else if (c instanceof OptionalCourse) System.out.println("Optional Course");
        else if (c != null) System.out.println("Course");
        else System.out.println("Что-то");
    }
}
