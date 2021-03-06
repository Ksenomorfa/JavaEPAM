package ru.polinabevad.javarecall.testing.module1;

/**
 * Тестовая программа
 *
 * @author Polina Bevad
 * @version 1.0
 */
public class HelloWorld {
    /**
     * Второй тестовый метод
     * Формирует строку "1".
     *
     * @param i Параметр i
     */
    public HelloWorld(int i) {
    }

    /**
     * Точка входа в класс
     *
     * @param args Массив строковых аргументов
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int a = 100;
        Homework11 obj = new Homework11();
        obj.hello();
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + "=" + args[i]);
        }
        AboutJava obj2 = new AboutJava();
        System.out.println(obj2.getAboutJava());
        //String s2 = obj2.info(); //error - has private access
    }

    /**
     * @return "1"
     */
    public String getAboutJava() {
        return "1";
    }
}

/**
 * Вложенный класс
 *
 * @version 1
 */
class AboutJava {
    public String getAboutJava() {
        return info();
    }

    /*
    Приватный метод
    @param Параметров нет
    @return "About Java"
    */
    private String info() {
        return "About Java";
    }
}


