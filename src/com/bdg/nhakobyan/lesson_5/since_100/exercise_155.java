package com.bdg.nhakobyan.lesson_5.since_100;

public class exercise_155 {
    public static void main(String[] args) {
        int sum = 0 ;
//        int n = 49;
        int x = 3;
        for (int i = 99; i > 0 ; i--) {
            if (i % x == 0){
                sum += i;
                System.out.println("the number is "+ i+ " the sum is "+sum);
            }
        }

    }
}
