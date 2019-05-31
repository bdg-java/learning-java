package com.bdg.nhakobyan.lesson_4.since_100;

public class exercise_164 {
    public static void main(String[] args) {
        int n = 31;
        for (int x = 100; x <= 999 ; x++) {
            if (Math.sqrt(x) > n)
                System.out.println(x);
        }
    }
}
