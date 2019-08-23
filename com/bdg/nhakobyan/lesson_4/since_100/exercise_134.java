package com.bdg.nhakobyan.lesson_4.since_100;

public class exercise_134 {
    public static void main(String[] args) {
        double x = 1 + Math.random()*9 , y = 0 , k  ;
        for ( k = 1 ; k < 8 ; k++) {
            if (x < 1) {
                y = Math.pow(x, k - 1);
                System.out.println("x < 1 "+y);
            }
            else if (x > 0 && x < 5){
                y = x*Math.pow(k,3);
                System.out.println("0 < x < 5 "+y);
            }
            else{
                y = Math.pow(10 , -6);
                System.out.println("Else " + y);
            }

        }
    }
}
