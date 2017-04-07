
package ru.polinabevad.javarecall.testing.module1;

import java.math.BigInteger;

public class CharacterClass {
    public static void main(String[] args) {
        char c='9';
        Character ch = new Character(c);
        System.out.println("charValue() " + ch.charValue());
        System.out.println("isJava " + Character.isJavaIdentifierStart(c));
        System.out.println("is Letter " + Character.isLetter(c));
        System.out.println("digit for l2 " + Character.forDigit(14, 16));
        
        BigInteger num1,num,bigNumI;
        num1=BigInteger.valueOf(1_000_000_000_000L);
        num=num1.multiply(num1).multiply(num1);
        System.out.println(num); 
        Integer iob = 71;
        if (bFalse()&&bTrue()) {
            System.out.println();
        }
        if (bFalse()&bTrue()) {
            System.out.println();
        }

    }
    private static boolean bFalse(){
        System.out.println("False ");
        return false;
    }
    
    private static boolean bTrue() {
        System.out.println("True ");
        return true;
    }
}
