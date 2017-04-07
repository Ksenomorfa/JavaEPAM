package ru.polinabevad.javarecall.testing.module2;

abstract class TableLow {
    public abstract void out();
}

class CircleTable extends TableLow{
    private int radius;

    public CircleTable (int r, int h) {
        radius = r;
    }
    public double getSquare() {

        return radius * radius * Math.PI;
    }
    public void out() {
        System.out.printf("| Circle   | radius  |%8.2f| \n", this.getSquare());
    }

}

class SquareTable extends TableLow{
    private int side;

    public SquareTable(int s, int h) {
        side = s;
    }
    public double getSquare()
    {
        return side*side;
    }
    public void out() {
        System.out.printf("| Square   | side    |%8.2f| \n", this.getSquare());
    }
}

class TablewithLC {
    private TableLow[] tables = {new SquareTable(1,2),new CircleTable(1,3)};

    public void out() {
        System.out.printf("| Type    | parameter | value | \n");
        for(int i=0;i<tables.length;i++) {
            tables[i].out();
        }
    }

}
class TableUse {

    public static void main(String[] args) {
        TablewithLC tablewithLC = new TablewithLC();

        tablewithLC.out();
    }

}

