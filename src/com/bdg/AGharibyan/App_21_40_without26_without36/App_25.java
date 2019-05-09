package com.bdg.AGharibyan.App_21_40_without26_without36;

public class App_25 {
    public static void main (String [] args) {

        int a = 10;
        int b = 11;
        int c = 20;

     /*   if (a + b > c) {
            if (b + c > a) {
                if (a + c > b) {
                    System.out.println("'y=1'");
                } else {
                    System.out.println("'y=2'");
                }
            } else {
                System.out.println("'y=2'");
            }
        } else {
            System.out.println("'y=2'");
        }
     */

        if ( a + b > c && a + c > b && b + c > a ){
            System.out.println("'y=1'");
        } else {
            System.out.println("'y=2'");
        }
    }
}
