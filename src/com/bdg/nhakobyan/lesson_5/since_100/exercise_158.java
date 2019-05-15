package com.bdg.nhakobyan.lesson_5.since_100;

public class exercise_158 {
    public static void main(String[] args) {
        int mult = 1;
        for (int i = 100; i < 300 ; i++) {
            if (i % 2 != 0 && i % 3 != 0 ) {
                mult = mult * i;
                System.out.println("the number is "+i+" sum is : " + mult);
            }
        }
    }
}
