package com.bdg.nhakobyan.lesson_2;

public class App_21 {

    public static void main (String [] args) {

    int a = 60;
    int b = 20;
    int c = 40;

 /*   if ( a > b){
        if (a > c) {
        System.out.println("Maximum :" + a);
        } else {
        System.out.println("Maximum :" + c);
        }
        }
    else {
        if ( b > c){
            System.out.println("Maximum :" + b);
        } else {
            System.out.println ("Maximum :" + c);
        }
        }
  */

    if ( a > b && a > c){
        System.out.println("Maximum :" + a);
    }
    if ( b > a && b > c ){
        System.out.println("Maximum :" + b);
    }
    if ( c > a && c > b ){
        System.out.println("Maximum :" + c);
    }
        }
}