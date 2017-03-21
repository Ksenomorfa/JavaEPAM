package ru.polinabevad.javarecall.epam.module2;

public class LogicBlock {
    private int x = 89;
    {
        x =20;
    }
    public LogicBlock(){}
    public LogicBlock(int x) {this.x=x;}
    public int getX() {return x;}

    public static void main(String[] args) {
        LogicBlock logic1 = new LogicBlock();
        LogicBlock logic2 = new LogicBlock(200);
        System.out.println("ligic1.x = " + logic1.getX());
        System.out.println("ligic2.x = " + logic2.getX());
    }
}
