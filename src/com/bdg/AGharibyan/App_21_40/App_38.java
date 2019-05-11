package com.bdg.AGharibyan.App_21_40;

/**
 * @author Ani Gharibyan
 */
public class App_38 {

    public static void main (String [] orgs) {

        int a = 1;
        int b = 2;
        int c = 4;
        int d = 10;

        int q = b/a;

     /*   if ( c == b * q ) {
            if ( d == c * q ) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
     */

        if ( b * q == c && c * q == d ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
