package ru.polinabevad.javarecall.epam;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        EPAMHomework11 obj = new EPAMHomework11();
        obj.Hello();
        for(int i=0;i<args.length;i++) {
            System.out.println("Аргумент " + i + "=" + args[i]);
        }
        AboutJava obj2 = new AboutJava();
        System.out.println(obj2.getAboutJava());
        //String s2 = obj2.info(); //error - has private access 
    }
}   

class AboutJava{
    public String getAboutJava(){
        return info();
    }

    private String info() {
        return "About Java";
    }
}


