package com.bdg;

public class App_35 {

    public static void main (String [] orgs) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 0;

        if ( a == b + c + d ) {
            System.out.println("true");
        } else {
            if ( b == a + c + d ) {
                System.out.println("true");
            } else {
                if ( c == a + b + d ) {
                    System.out.println("true");
                } else {
                    if ( d == a + b + c ) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }
            }
        }
    }
}
