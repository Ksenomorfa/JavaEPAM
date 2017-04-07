package ru.polinabevad.javarecall.testing.module2;

public class Table {
    private Desk desk;
    private int legsCount;
    private Leg[] legs;
    Table(Desk d, Leg[] l) {
        desk = d;
        legs = l;
    }

    Table(int width, int length, int heigth, int deskHeight, int legSection, int legsCount) {
        desk = new Desk(width, length, deskHeight);
        this.legsCount = legsCount;
        legs = new Leg[legsCount];
        for(int i=0; i<legsCount;i++){
            legs[i]=new Leg(legSection, legSection, heigth-deskHeight);
        }
    }
    @Override
    public String toString() {
        String str = "";
        for (int i=0; i<legsCount;i++) {
            str += " " + this.legs[i].getHeight() + this.legs[i].getLength()+ this.legs[i].getWidth();
        }
        return "Desk:" + desk + desk.getHeigth() + " " + desk.getLength() + " "
                + desk.getWidth() + " Legs:" + legs + str;

    }

    public static void main(String[] args) {
        Desk  desk = new Desk(900,900,20);
        Leg[] legs = {new Leg(40,40,880),new Leg(40,40,880),new Leg(40,40,880),new Leg(40,40,880)};
        //Table table1 = new Table(desk, legs);
        Table table2 = new Table(900,900,900,20,40,4);
        //System.out.println(table1);
        System.out.println(table2);
    }
}
class Desk {
    private int width;
    private int length;
    private int heigth;

     Desk(int w, int l, int h) {
        width = w;
        length = l;
        heigth = h;
    }

     int getWidth() {
        return width;
    }

     int getLength() {
        return length;
    }

     int getHeigth() {
        return heigth;
    }
}

class Leg {
    private int width;
    private int length;
    private int height;

     Leg(int w, int l, int h)
    {
        width = w;
        length = l;
        height = h;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return "Leg: " + width + " " + height + " " + length;
    }
}
