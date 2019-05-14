package com.bdg.nhakobyan.lesson_5.since_100;

public class exercise_136 {
    public static void main(String[] args) {
        double x = 1 + Math.random()*9 , y = 0  ;
        for (double k = 2; k <= 8 ; k++) {
            if (x > 3 && x < 7){
                y = 9*Math.pow(x,k);
                System.out.println("in if condition "+ y);
            }
            else {
                y = 8*x + Math.pow(k,3);
                System.out.println("Else condition " + y);
            }
        }
    }
}
