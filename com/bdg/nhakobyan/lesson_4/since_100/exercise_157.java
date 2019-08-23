package com.bdg.nhakobyan.lesson_4.since_100;

public class exercise_157 {
    public static void main(String[] args) {
        int sum = 0;
        int x = 5;
        for (int i = 100; i < 999 ; i++) {
            if (i % 5 != 0)
                sum += i;
        }
        System.out.println("sum is : " + sum );
    }
}
