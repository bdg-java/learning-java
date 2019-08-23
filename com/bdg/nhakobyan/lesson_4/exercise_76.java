package com.bdg.nhakobyan.lesson_4;

public class exercise_76 {
    public static void main(String[] args) {
        double x ;
        double y = 0;
        for ( x = -5 ; x <= 5 ; x += 2) {
                if (x > 0 )
                    y = x*x + 4*(Math.pow(x,8));
                else{
                    y = 0;
                }
             System.out.println("x is : " + x + " y is : " + y);
        }

    }
}
