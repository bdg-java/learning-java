package com.bdg.nhakobyan.lesson_5;

public class exrecise_90 {
    public static void main(String[] args) {
        double x ;
        double y = 0;
        for ( x = -30 ; x <= 30 ; x += 3.5) {
            if (x > 5 )
                y = Math.sin(x);
            else{
                y = Math.cos(x);
            }
            System.out.println("x is : "  + x + " y is : " + y);
        }
    }
}
