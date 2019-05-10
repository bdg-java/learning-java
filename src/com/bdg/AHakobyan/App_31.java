package com.bdg.AHakobyan;

public class App_31 {
    public static void main(String[] args) {

        int a = 20;
        int b = 15;
        int c =10;
        int d = 5;

        if (a > b && b > c && c > d) {
            System.out.print("MAXIMUM" + a);
        } else if (b > a && a > c && c > d) {
            System.out.print("MAXIMUM" + b);
        } else if (c > a && a > b && b > d) {
            System.out.print("MAXIMUM" + c);
        } else if (d > a && a>b && b > c)
            System.out.print("MAXIMUM" + d);
        }
}


