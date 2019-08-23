package com.bdg.nhakobyan.lesson_4.since_100;

public class exercise_159 {
    public static void main(String[] args) {
        long mult = 1;
        for (int i = 100; i < 1000 ; i++) {
            if (i % 3 == 1 && i % 4 == 2 ) {
                mult = mult * i;
                System.out.println("the number is "+i+" sum is : " + mult);
            }
        }
    }
}
