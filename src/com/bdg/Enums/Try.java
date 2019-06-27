package com.bdg.Enums;

enum Levele {
    LOW,
    MEDIUM,
    HIGH
}

public class Try {
    public static void main(String[] args) {
        Levele myVar = Levele.MEDIUM;

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }


}
