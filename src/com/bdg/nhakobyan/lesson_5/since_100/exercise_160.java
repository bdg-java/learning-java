package com.bdg.nhakobyan.lesson_5.since_100;

public class exercise_160 {
    public static void main(String[] args) {
        for (int x = 100; x < 200 ; x++) {

            if(Math.sqrt(16*x) % 2 == 0){
                System.out.println(x);
                break;
            }
        }
    }
}
