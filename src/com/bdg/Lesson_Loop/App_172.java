package com.bdg.Lesson_Loop;

public class App_172 {
    public static void main(String[] args) {
        long N = 5;
        long a = 1;
        long sum =1;
        for (int i = 1; i <= N; i++) {
            sum = a * i;
            a = a * (N-2);
        }
        System.out.println( sum);
    }
}
