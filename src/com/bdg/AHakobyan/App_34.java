package com.bdg.AHakobyan;

public class App_34 {
    public static void main(String [] args) {

        int a = 20;
        int b = 15;
        int c = 10;
        int d = 5;

        if ((a + b) == (c + d)) {
            System.out.print("TRUE");
        } else if ((a + c)== (b + d) ) {
            System.out.print("TRUE");
        } else if ((a + d) == (b + c)) {
            System.out.print("TRUE");
        } else
            System.out.print("FALSE");
        }
}

