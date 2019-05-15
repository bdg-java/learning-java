package com.bdg.nhakobyan.lesson_5.since_100;

public class exercise_165 {
    public static void main(String[] args) {
        boolean t = false;
        double n = 30;
        for (int i = 1; i < 9 ; i++) {
            if (Math.pow(3,i) == n){
                t = true;
            }
        }
        System.out.println(t);
    }
}
