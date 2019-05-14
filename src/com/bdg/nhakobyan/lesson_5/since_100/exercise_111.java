package com.bdg.nhakobyan.lesson_5.since_100;

public class exercise_111 {
    public static void main(String[] args) {
        double x = 4 , y;
        int n ;
        for ( n = 1; n < 6 ; n++) {
            y = x + (Math.pow(x , 4*n+1))/4*n+1;
            System.out.println("y is : " + y);
        }
    }
}
