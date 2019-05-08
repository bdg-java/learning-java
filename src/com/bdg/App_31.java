package com.bdg;

public class App_31 {

    public static void main (String [] args) {

        int a = 100000;
        int b = -100;
        int c = 0;
        int d = 99999;

        if ( a < b ) {
            if ( b < c ) {
                if ( c < d ) {
                    System.out.println("Maximum :" + d);
                } else {
                        System.out.println("Maximum :" + c);
                    }
            } else {
                if ( b < d) {
                    System.out.println("Maximum :" + d);
                } else {
                    System.out.println("Maximum :" + b);
                }
            }
        } else {
            if ( a < c) {
                if ( c < d ) {
                    System.out.println("Maximum :" + d);
                } else {
                    System.out.println("Maximum :" + c);
                }
            } else {
                if ( a < d) {
                    System.out.println("Maximum :" + d);
                } else {
                    System.out.println("Maximum :" + a);
                }
            }
        }
    }
}
