package ru.polinabevad.javarecall.epam.module2;

public interface TestInterface {

    static void main(String[] args) {
        System.out.println(get().mByte(150.365));
    }
    static TestInterface get() {
        return new TestInterface() {
          @Override
          public int m(double d) {
              return new Double(d).intValue();
          }
        };
    }

    int m(double a);

    default byte mByte(double d) {
        int m = m(d);
        if (m<128 && m>-129)
            return (byte) m;
        else return 0;
    }
}
