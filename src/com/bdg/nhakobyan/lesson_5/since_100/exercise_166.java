package com.bdg.nhakobyan.lesson_5.since_100;

public class exercise_166 {
    public static void main(String[] args) {
        int y = 0;
        double n = 16;
        for (int i = 1; i < 9 ; i++) {
            if (Math.pow(4,i) == n){
                y = 1;
            }
        }
        System.out.println(y);
    }
}
