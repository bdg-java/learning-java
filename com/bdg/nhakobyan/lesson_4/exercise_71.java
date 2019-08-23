package com.bdg.nhakobyan.lesson_4;

public class exercise_71 {
    public static void main(String[] args) {

        double x = 2.4;
        double y = 0;
        for (x = 2.4; x <= 7.6 ; x += 0.2 ) {
                y = Math.tan(2*x + x * x);
        }
         System.out.println("x is : "+x + " " + "y is : "+ y);
    }
}
