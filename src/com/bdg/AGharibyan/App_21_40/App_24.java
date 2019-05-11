package com.bdg.AGharibyan.App_21_40;

/**
 * @author Ani Gharibyan
 */
public class App_24 {

    public static void main (String [] args) {

        int a = 2;
        int b = 2;
        int c = 2;

     /*   if ( a == 2 ) {
            if ( b == 2 ) {
               if ( c == 2 ){
                   System.out.println ("false");
               } else {
                   System.out.println ("true");
               }
            } else {
                if ( c == 2 ) {
                    System.out.println ("true");
                } else {
                    System.out.println ("false");
                }
            }
        } else {
            if ( b == 2 ) {
                if ( c == 2 ) {
                    System.out.println ("true");
                } else {
                    System.out.println ("false");
                }
            } else {
                System.out.println ("false");
            }
        }
    */

        if ( a == b && b == 2 ){
            if ( c == 2 ){
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        } else if ( a == c && c == 2 ){
            if ( b == 2 ){
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        } else if ( b == 2 && c == 2 ){
            if ( a == 2 ){
                System.out.println("false");
            } else{
                System.out.println("true");
            }
        }
    }
}
