package com.bdg;

public class App_21 {

    public static void main (String [] args) {

    int a = 60;
    int b = 20;
    int c = 40;

    if ( a > b){
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
        }
}