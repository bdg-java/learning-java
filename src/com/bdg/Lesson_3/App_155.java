package com.bdg.Lesson_3;

public class App_155 {
    public static void main(String[] args) {

            int sum = 0;
        for (int x = 10; x < 100; x++) {
            if ( x % 3 == 0){
                System.out.println(x);
                sum += x;
            }
        }
        System.out.println(sum);
    }
}