package com.bdg;

public class App_52 {
    public static void main(String[] args) {

        int t = 122;

        int a = t % 10;
        int b = t / 100;
        int c = t / 10 % 10;

        if ( a == b || a == c || b == c ) {


            System.out.println("true");

        } else {


            System.out.println("false");



        }



    }
}
