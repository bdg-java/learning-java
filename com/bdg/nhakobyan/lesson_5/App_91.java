package com.bdg.nhakobyan.lesson_5;


/**
 * @author William Arustamyan
 */


public class App_91 {

    public static void main(String[] args) {

        double sum = 0;
        int n = 100;


        for (double x = 1; x < n; x = x + 0.5) {
            sum = sum + x * x;
        }

    }
}
