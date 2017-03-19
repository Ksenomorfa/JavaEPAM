package ru.polinabevad.javarecall.eckel.chapter3;
import static net.mindview.util.Print.*;

class Tank {
    float level;
}
public class Assignment {
    public static void main(String[] args) {
        Tank t1=new Tank();
        Tank t2=new Tank();
        t1.level=9.365f;
        t2.level=47.312f;

        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level=t2.level;
        print("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level=27;
        print("3: t1.level: " + t1.level + ", t2.level: " + t2.level);


    }
}
