package com.bdg.nhakobyan.lesson_5;

public class exercise_77 {
    public static void main(String[] args) {
        double x ;
        double y = 0;
        for ( x = -8 ; x <= 8 ; x += 3) {
            if (x > 3 )
                y = x*x + 4*(Math.pow(x,8));
            else{
                y = 0;
            }
             System.out.println("x is : " + x + " y is : " + y);

        }

    }
}
