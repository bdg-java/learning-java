package com.bdg;

public class App_24 {

    public static void main (String [] args) {

        int a = 2;
        int b = 2;
        int c = 100;

        if ( a == 2 ) {
            if ( b == 2 ) {
                System.out.println ("true");
            } else {
                if ( c == 2 ) {
                    System.out.println ("true");
                } else {
                    System.out.println ("false");
                }

            }
        } else {
            if ( b == 2 ) {
                if ( c == 2 ) {
                    System.out.println ("true");
                } else {
                    System.out.println ("false");
                }
            } else {
                System.out.println ("false");
            }
        }

    }
}
