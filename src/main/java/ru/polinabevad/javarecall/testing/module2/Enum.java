package ru.polinabevad.javarecall.testing.module2;

public class Enum {
    public enum Season {
        WINTER,
        SPRING,
        SUMMER,
        FALL;

        public boolean isWeekend() {
            switch (this) {
                case SUMMER:
                    return true;
                default:
                    return false;
            }
        }
    }

    public static void main(String[] args) {
        Season season = Season.FALL;
        System.out.println(season);
        season = Season.valueOf("SPRING");
        System.out.println(season.isWeekend() + " " + Season.values());
        //System.out.println(Season.valueOf(String.class,"FALL"));

        Shape[] arr = Shape.values();
        for (Shape sh : arr) {
            System.out.println(sh + " " + sh.getColor());
        }
    }

    public enum Shape {
        RECTANGLE("red"),
        TRIANGLE("green"),
        CIRCLE("blue");

        String color;

        Shape(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }
    }
}