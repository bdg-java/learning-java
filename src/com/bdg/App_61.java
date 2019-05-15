package com.bdg;

public class App_61 {
    public static void main(String[] args) {

        int t = 2736;

        int a = t % 10;
        int b = t / 100;
        int c = t / 10 % 10;
        int d =  t / 1000;

        if ( a + b == c + d) {
            System.out.println("true");

        } else {
            System.out.println("false");

        }
    }
}
