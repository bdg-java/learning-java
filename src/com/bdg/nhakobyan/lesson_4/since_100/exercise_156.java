package com.bdg.nhakobyan.lesson_4.since_100;

public class exercise_156 {
    public static void main(String[] args) {
        int mult = 1 ;
        for (int i = 99; i > 0 ; i--) {
            if (i % 3 == 0 && i % 5 == 0){
                mult *= i;
                System.out.println("the number is "+ i+ " the sum is " + mult);
            }
        }
    }
}
