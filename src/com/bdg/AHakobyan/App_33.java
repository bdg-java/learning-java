package com.bdg.AHakobyan;

public class App_33 {
    public static void main(String[] args ) {

        int a = 20;
        int b = 15;
        int c = 10;
        int d = 5;

        if (a == b || a == c || a == d) {
            System.out.print("TRUE");
        } else if (b == c || b == d) {
            System.out.print("TRUE");
        } else if (c == d) {
            System.out.print("TRUE");
        } else
            System.out.print("FALSE");
            }
}

