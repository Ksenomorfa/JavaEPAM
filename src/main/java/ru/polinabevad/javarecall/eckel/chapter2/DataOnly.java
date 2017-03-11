
package ru.polinabevad.javarecall.eckel.chapter2;

public class DataOnly {
    int i;
    double d;
    boolean b;
    int a;
    
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i=100;
        data.d = 10495.3534;
        data.b = false;
        data.print();
       
        data.a = data.storage("String of text");
        System.out.println(data.a);
    }
    
    void print(){
        System.out.println("i = " + i + " d = " + d + " b = " + b);
    }
    
    int storage (String s) {
        return s.length()*2;
    }
    
}
