package ru.polinabevad.javarecall.testing.module2;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Integer> obl = new Optional<Integer>();
        obl.setValue(1);

        //obl.setValue("");
        int v1 = obl.getValue();
        System.out.println(v1);

        Optional<String> ob2= new Optional<String>("Java");
        String v2 = ob2.getValue();
        System.out.println(v2);

        //obl=ob2;

        Optional<java.io.Serializable> ob3 = new Optional<>();
        System.out.println(ob3.getValue());
        ob3.setValue("Java Se6");
        System.out.println(ob3.toString());
        ob3.setValue(71);
        System.out.println(ob3.toString());

        ob3.setValue(null);
    }
}
