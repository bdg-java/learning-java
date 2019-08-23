package com.bdg.nhakobyan.lesson_4.since_100;

public class exercise_120 {
    public static void main(String[] args) {
        double x = 10 , y = 0 ,n = 0;
        for ( n = 0; n < 50 ; n++) {
            y = 4/3 +(Math.pow(4 , n+1)*Math.pow(x + 1, n)) / Math.pow(n,2) + 2 * n + 3;
            System.out.println(y);
        }
        
    }
}
