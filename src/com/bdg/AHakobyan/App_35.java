package com.bdg.AHakobyan;

public class App_35 {
    public static void main(String [] args) {

        int a = 2;
        int b = 15;
        int c = 10;
        int d = 5;

        if(a == (b + c + d) || b == (a + c + d) || c == (a + b + d) || d == (a + b + c)) {
            System.out.print("TRUE");
        }else
            System.out.print("FALSE");
    }
}
