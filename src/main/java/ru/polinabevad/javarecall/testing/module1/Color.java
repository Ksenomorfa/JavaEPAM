package ru.polinabevad.javarecall.testing.module1;

public class Color {
    public static void main(String[] args) {
        int [] price = new int[10];
        int [] rooms = new int[] {1,2,3};
        Item[] items = new Item[10];
        Item [] undefinedItems=new Item[] {new Item(1),new Item(2)};
        for(int x : price)
        {
            System.out.println("Java" + x);
        }

        int[][] ia={{1,2},null};
        int[][] ja=(int[][]) ia.clone();
        System.out.println((ia==ja) + "  ");
        System.out.println(ia[0]==ja[0]&& ia[1]==ja[1]);

        ColoredPoint[] cpa = new ColoredPoint[10];
        Point[] pa = cpa;
        System.out.println(pa[1]==null);

        for(ColoredPoint x : cpa)
        {
            System.out.println("Java" + x);
        }
        try {
            pa[0] = (ColoredPoint)new Point();
        } catch (ArrayStoreException e) {
            System.out.println(e);
        }
    }
}

class Item {
    public Item(int i) {

    }
}
class Point {int x,y; }
class ColoredPoint extends Point { int color;}