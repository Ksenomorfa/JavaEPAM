package ru.polinabevad.javarecall.testing.module2;

@MyAnno(params =  {"456", "789"})
public class ClassWithAnnotation {
    public static void main(String[] args) {
        System.out.println(ClassWithAnnotation.class.getDeclaredAnnotation(MyAnno.class).params()[0]);
    }
}
