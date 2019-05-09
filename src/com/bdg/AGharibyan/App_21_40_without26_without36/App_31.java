package com.bdg.AGharibyan.App_21_40_without26_without36;

/**
 * @author Ani Gharibyan
 */
public class App_31 {

    public static void main (String [] args) {

        int a = 100000;
        int b = -100;
        int c = 0;
        int d = 99999;

    /*    if ( a < b ) {
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
     */

        if ( a > b && a > c && a > d ){
            System.out.println("Maximum : " + a);
        }
        if ( b > a && b > c && b > d ){
            System.out.println("Maximum : " + b);
        }
        if ( c > a && c > b && c > d ){
            System.out.println("Maximum : " + c);
        }
        if ( d > a && d > b && d > c ){
            System.out.println("Maximum : " + d);
        }
    }
}
