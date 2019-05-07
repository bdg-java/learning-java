package com.bdg;

public class App_32 {

    public static void main (String [] orgs) {

        int a = 100000;
        int b = -100;
        int c = 0;
        int d = 99999;

        if ( a > b) {
            if ( b > c) {
                if ( c > d ) {
                    System.out.println("Minimum :" + d);
                } else {
                    System.out.println("Minimum :" + c);
                }
            } else {
                if ( b > d ) {
                    System.out.println("Minimum :" + d);
                } else {
                    System.out.println("Minimum :" + b);
                }
            }
        } else {
            if ( a > c ) {
                if ( c > d ) {
                    System.out.println("Minimum :" + d);
                } else {
                    System.out.println("Minimum :" + c);
                }
            } else {
                if ( a > d ) {
                    System.out.println("Minimum :" + d);
                } else {
                    System.out.println("Minimum :" + a);
                }
            }
        }
    }
}
