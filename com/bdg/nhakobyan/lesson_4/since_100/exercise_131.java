package com.bdg.nhakobyan.lesson_4.since_100;

public class exercise_131 {
    public static void main(String[] args) {
        double y , x = -2 + Math.random()*9;
        for (double k = 1; k <= 4 ; k++) {
            if (x > 1){
                y = Math.pow(3*x,k+1);
                System.out.println("in if condition "+ y);
            }
            else{
                y = 5*x + Math.pow(k,7);
                System.out.println("Else condition " + y);}
        }
    }
}
