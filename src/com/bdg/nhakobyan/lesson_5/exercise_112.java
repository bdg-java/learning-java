package com.bdg.nhakobyan.lesson_5;

public class exercise_112 {
    public static void main(String[] args) {
        int x = 4;
        int y = 0;
        for (int n = 1; n < 6 ; n++) {
            System.out.println((Math.cos(2*n-1)*x)/Math.pow(2,2*n-1));
        }
    }
}
