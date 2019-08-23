package com.bdg.nhakobyan.lesson_4;


/**
 * @author William Arustamyan
 */


public class App_83 {

    public static void main(String[] args) {

        double y = 0.0;

        double x = -4.8;

        while (x <= 5.2) {
            y = y + Math.pow(Math.atan(x + 1), 2.0);
            x = x + 0.2;
        }

        System.out.println(y);
    }
}
