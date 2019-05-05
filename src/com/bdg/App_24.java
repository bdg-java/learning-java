package com.bdg;

public class App_24 {


    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 2;
        boolean isEqual = false;
        //Ev i nshanna

        //nshanakuma a ev b havasar e 2-i
        if (a == 2 && b == 2) {
            isEqual = true;
        }
        if (a == 2 && c == 2) {
            isEqual = true;
        }
        if (b == 2 && c == 2) {
            isEqual = true;
        }
        if (isEqual) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
