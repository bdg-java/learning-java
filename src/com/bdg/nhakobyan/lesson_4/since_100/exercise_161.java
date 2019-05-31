package com.bdg.nhakobyan.lesson_4.since_100;

public class exercise_161 {
    public static void main(String[] args) {
        for (int x = 1000; x < 3000 ; x++) {

            if(Math.sqrt(26*x) % 2 == 0){
                System.out.println(x);

            }
        }
    }
}
