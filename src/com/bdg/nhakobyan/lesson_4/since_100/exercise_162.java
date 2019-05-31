package com.bdg.nhakobyan.lesson_4.since_100;

public class exercise_162 {
    public static void main(String[] args) {
        for (int x = 9999; x > 1000; x--) {

            if(Math.sqrt(14*x) % 2 == 0){
                System.out.println(x);

            }
        }
    }
}
