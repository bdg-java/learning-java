package com.bdg.nhakobyan.lesson_5;

public class exercise_82 {
    public static void main(String[] args) {
        double x ;
        double y = 0;
        for ( x = -2.7 ; x < 3.8 ; x += 0.5) {
            y = Math.pow(x+x*x , 7);
        }
        System.out.println("x is : " + x +" y is : " + y);

    }
}
