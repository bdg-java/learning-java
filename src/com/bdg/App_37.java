package com.bdg;

public class App_37 {

    public static void main(String[] args) {


        int a = 4;
        int b = 6;
        int c = 8;
        int d = 10;


        int de = b - a;

     /*   if (b + de == c) {
            if (c + de == d) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        } else {
            System.out.println("FALSE");
        }
     */

        if ( b + de == c && c + de == d ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
