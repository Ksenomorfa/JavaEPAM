
package ru.polinabevad.javarecall.eckel.chapter2;

public class AllColorsOfTheRainbow {
    
    void changeTheHue(int newHue) {
        newHue = 105;
    }
    public static void main(String[] args) {
        int anInteger = 6;
        AllColorsOfTheRainbow all = new AllColorsOfTheRainbow();
        all.changeTheHue(anInteger);
        System.out.println(anInteger);
    }
}
