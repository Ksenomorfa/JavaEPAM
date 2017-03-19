package ru.polinabevad.javarecall.eckel.chapter3;
import static net.mindview.util.Print.*;

class Letter {
    char c;
}
class LetterFloat {
    float y;
}
public class PassObject {
    static void f(Letter y) {
        y.c ='z';
    }
    static void qru(LetterFloat a){
        a.y=10;
    }

    static void notObject(int i) {
        i=10;
    }
    static int notObjectRet(int i) {
        return i=10;
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        f(x);
        print("1: x.c: " + x.c);

        LetterFloat op  = new LetterFloat();
        op.y = 9.993f;
        print("1: op.y: " + op.y);
        qru(op);
        print("1: op.y: " + op.y);
        int i=15;
        notObject(i);
        print("1: i: " + i);
        int r = notObjectRet(i);
        print("1: r: " + r);
        print("1: i: " + i);
    }
}
