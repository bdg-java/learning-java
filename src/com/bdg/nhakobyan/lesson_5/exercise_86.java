package com.bdg.nhakobyan.lesson_5;

public class exercise_86 {
    public static void main(String[] args) {
        double x ;
        double y = 0;
        for ( x = -5 ; x <= 8 ; x += 2) {
            if (x > 2)
                y = Math.pow(3,x+4);
            else{
                y = -8;
            }
            System.out.println("x is : " + x +" y is : " + y);
        }
    }
}
