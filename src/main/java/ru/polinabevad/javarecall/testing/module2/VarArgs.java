package ru.polinabevad.javarecall.testing.module2;

public class VarArgs {

    void methodName(Object... args)
    {
        if (args.length==0) {
            System.out.println("No Args");
        }
        for (Object i: args) {
            System.out.println("Obj: " + i);
        }
    }

    void methodName(Integer[]... args) {
        if (args.length==0) {
            System.out.println("No Args");
        }
        for (Integer[] i: args) {
            for(Integer x : i) {
                System.out.println("Obj: " + x);
            }
        }
    }

    public static void main(String[] args) {
        VarArgs var = new VarArgs();
        var.methodName(1,"ldf",1239,true);
        Integer[] x={1,2,3};
        //var.methodName(x);
        var.methodName(x,x);
    }
}
