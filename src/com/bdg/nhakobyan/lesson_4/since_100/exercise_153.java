package com.bdg.nhakobyan.lesson_4.since_100;

public class exercise_153 {
    public static void main(String[] args) {
        int sum = 1 ; // the summary
        int n = 49; // the range
        int x = 7; // the number we want to check
        for (int i = 0; i < n ; i++) {
            if (i % x == 2) {
                sum += i;
                System.out.println("the number is "+ i+" the summary is " + sum);
            }
        }
    }
}
