package ru.polinabevad.javarecall.epam.module2;

import java.lang.annotation.Annotation;

@MyAnno(params =  {"456", "789"})
public class ClassWithAnnotation {
    public static void main(String[] args) {
        System.out.println(ClassWithAnnotation.class.getDeclaredAnnotation(MyAnno.class).params()[0]);
    }
}
