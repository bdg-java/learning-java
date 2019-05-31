package com.bdg.nhakobyan.lesson_4.since_100;

public class exercise_140 {
    public static void main(String[] args) {
        double y , x = 1 + Math.random()*9;
        System.out.println("x is " + x);

        for (int k = 2; k <= 10 ; k++) {
            if (x > 3 && x < 5){
                y = Math.pow(x,k+6);
                System.out.println("first condition " + y);
            }
            else if (x <= 3){
                y = x + Math.pow(k,4);
                System.out.println("second condition " + y);
            }
            else{
                y = Math.pow(5,6);
                System.out.println("else "+y);
            }
        }
    }
}
