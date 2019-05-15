package com.bdg.nhakobyan.lesson_5.since_100;

public class exercise_152 {
    public static void main(String[] args) {
        int mult = 1 ; // the summary
        int n = 49; // the range
        int x = 7; // the number we want to check
        for (int i = 1; i < n ; i++) {
            if (i % x == 0){
                mult *=  i;
                System.out.println("the number is "+ i + " the sum is " +mult);
            }
        }

    }
}
