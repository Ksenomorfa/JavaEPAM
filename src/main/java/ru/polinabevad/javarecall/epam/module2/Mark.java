package ru.polinabevad.javarecall.epam.module2;

public class Mark <T extends Number> {
    public T mark;
    public Mark (T value) {
        mark = value;
    }

    public T getMark() {
        return mark;
    }

    public void setMark(T mark) {
        this.mark = mark;
    }
    public int roundMark() {
        return Math.round(mark.floatValue());
    }

    public boolean sameAny (Mark<?> obj) {
        return roundMark() == obj.roundMark();
    }

    public boolean same(Mark<T> ob) {
        return getMark() == ob.getMark();
    }

}
