package com.bdg.AHakobyan;

public class App_24 {
    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int c = 5;

        if (a == 2 && b == 2) {
            System.out.print("TRUE");
            if (a == 2 && c == 2) {
                System.out.print("TRUE");
                if (b == 2 && c == 2) {
                    System.out.print("TRUE");
                } else
                    System.out.print("FALSE");
            }

        }
    }
}