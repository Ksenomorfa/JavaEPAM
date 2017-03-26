package ru.polinabevad.javarecall.epam.module2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Указание аннотацией для чего будет использоваться аннотаwия - в рантайме
// или для компилятора и для какого типа
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String[] params();

}
