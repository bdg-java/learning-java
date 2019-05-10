package com.bdg.AHakobyan;

public class App_30 {
    public static void main(String[] args) {

        int a = 15;
        int b = 10;
        int c = 5;

        if (a <= b && b <= c) {
            System.out.print(c + " " + b + " " + a);
        } else if (a <= c && c <= b) {
            System.out.print(b + " " + c + " " + a);
        } else if (c <= b && b <= a) {
            System.out.print(a + " " + b + " " + c);
        }
    }
}
