package com.bdg.AGharibyan.App_21_40_without26_without36;

/**
 * @author Ani Gharibyan
 */
public class App_32 {

    public static void main (String [] orgs) {

        int a = 100000;
        int b = -100;
        int c = 0;
        int d = 99999;

     /*   if ( a > b) {
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
     */

        if ( a < b && a < c && a < d ){
            System.out.print("Minimum : " + a);
        }
        if ( b < a && b < c && b < d ){
            System.out.print("Minimum : " + b);
        }
        if ( c < a && c < b && c < d ){
            System.out.print("Minimum : " + c);
        }
        if ( d < a && d < b && d < c ){
            System.out.print("Minimum : " + d);
        }
    }
}
