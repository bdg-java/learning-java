package com.bdg.nhakobyan.lesson_4.since_100;

public class exercise_119 {
    public static void main(String[] args) {
            double x = 8,y = 0;
            double n;
        for ( n = 1; n < 20 ; n++) {
            y = Math.sin(3*x + 2)/Math.pow(3,2) + (Math.sin(3*x + 2*n + 2))/Math.pow(3 , 2*n+2);
        }
        System.out.println(y);
    }
}
