package com.bdg.agharibyan.app_21_40;

/**
 * @author Ani Gharibyan
 */
public class App_33 {

    public static void main (String [] orgs) {

        int a = 500;
        int b = 19;
        int c = 0;
        int d = 2;

    /*    if ( a == 1 ) {
            System.out.println("true");
            } else {
                if ( b == 1 ) {
                    System.out.println("true");
                } else {
                    if ( c == 1 ) {
                        System.out.println("true");
                    } else {
                        if ( d == 1 ) {
                            System.out.println("true");
                        } else {
                            System.out.println("false");
                        }
                    }
            }
        }
     */

        if ( a == 1 || b == 1 || c == 1 || d == 1 ){
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
