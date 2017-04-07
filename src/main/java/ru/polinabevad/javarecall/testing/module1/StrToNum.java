package ru.polinabevad.javarecall.testing.module1;

/**
 * Created by Ksenomorfa on 3/12/2017.
 */
public class StrToNum {
    public static void main(String[] args) {
        String strInt="123";
        String strDouble = "123.24";
        int x;
        double y;
        double z;

        x= Integer.parseInt(strInt);
        y=Double.parseDouble(strDouble);
        System.out.println(x + y);

        strInt = String.valueOf(x+1);
        if (strInt instanceof String) System.out.println("true");
        strDouble = String.valueOf(y+1);
        System.out.println("StrInt =" + strInt);
        System.out.println("StrDouble =" + strDouble);
        int f= Integer.valueOf("204");
        System.out.println(strInt+strDouble);
        System.out.println(f);

        String str;
        str = "num ="+245;
        System.out.println(str);
        str = 245+" = num";
        System.out.println(str);

        System.out.println(Integer.toString(285));
        System.out.println(Integer.toBinaryString(285));
        System.out.println(Integer.toHexString(285));
        System.out.println(Integer.toOctalString(285));

    }
}
