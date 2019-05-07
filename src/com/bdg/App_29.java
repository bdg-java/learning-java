package com.bdg;

public class App_29 {

    public static void main (String [] args) {

        int a = 6;
        int b = 1;
        int c = 5;

        if ( a < b ) {
            if ( b < c ) {
                System.out.println("a , b , c");
            } else {
                System.out.println("a , c , b");
            }
        } else {
            if ( a < c ) {
                System.out.println("b , a , c");
            } else {
                System.out.println("b , c , a");
            }
        }
    }
}
