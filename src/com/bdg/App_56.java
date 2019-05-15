package com.bdg;

public class App_56 {
    public static void main(String[] args) {

        int t = 237;

        int a = t % 10;
        int b = t / 100;
        int c = t  / 10 % 10;

        if ( c > b) {
            System.out.println((a + b + c) / t );

        } else {
            System.out.println(t);



        }


    }
}
