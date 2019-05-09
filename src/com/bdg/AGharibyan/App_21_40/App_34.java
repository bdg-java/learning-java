package com.bdg.AGharibyan.App_21_40;

/**
 * @author Ani Gharibyan
 */
public class App_34 {

    public static void main (String [] orgs) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 0;

        int ab = a + b;
        int ac = a + c;
        int ad = a + d;
        int bc = b + c;
        int bd = b + d;
        int cd = c + d;

    /*    if ( ab == cd ) {
            System.out.println("true");
        } else {
            if ( ac == bd ) {
                System.out.println("true");
            }  else {
                if ( ad == bc ) {
                    System.out.println("true");
                }  else {
                    System.out.println("false");
                }
            }
        }
     */

        if ( ab == cd || ac == bd || ad == bc ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
