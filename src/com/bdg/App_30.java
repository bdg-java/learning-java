package com.bdg;

public class App_30 {
    public static void main(String[] args) {
        int a = 236;
        int b = 459;
        int c = 674;

        if (a < b) {
            if (b < c) {
                System.out.println(c + "," + b + "," + a);
            }
        } else if (a < c) {
            if (c < b) {
                System.out.println(b + "," + c + "," + a);
            }
        } else if (b < c) {
            if (c < a) {
                System.out.println(" " + a + " " + c + " " + b);
            }
        } else if (b < a) {
            if (a < c) {
                System.out.println(c + "," + a + "," + b);
            }
        } else if (c < a) {
            if (a < b) {
                System.out.println(b + "," + a + "," + c);
            }
        } else if (c < b) {
            if (b < a) {
                System.out.println(a + "," + b + "," + c);
            }
        }

    }
}

