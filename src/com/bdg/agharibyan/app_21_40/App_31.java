package com.bdg.agharibyan.app_21_40;

/**
 * @author Ani Gharibyan
 */
public class App_31 {

    public static void main (String [] args) {

        int a = 100000;
        int b = -100;
        int c = 0;
        int d = 999999;

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
        } else if ( b > a && b > c && b > d ){
            System.out.println("Maximum : " + b);
        } else if ( c > a && c > b && c > d ){
            System.out.println("Maximum : " + c);
        } else {
            System.out.println("Maximum : " + d);
        }
    }
}
