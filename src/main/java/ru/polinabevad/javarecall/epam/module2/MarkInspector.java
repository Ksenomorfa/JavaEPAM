package ru.polinabevad.javarecall.epam.module2;

public class MarkInspector {
    public static void main(String[] args) {
        //Mark<String> ms = new Mark<String>("7");
        Mark<Double> md = new Mark<Double>(71.4D);
        System.out.println(md.sameAny(md));
        Mark<Integer> mi = new Mark<Integer>(71);
        System.out.println(md.sameAny(mi));
        //md.same(mi);
        System.out.println(md.roundMark());

    }
}
