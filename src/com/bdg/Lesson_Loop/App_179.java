package com.bdg.Lesson_Loop;

public class App_179 {
    public static void main(String[] args) {
        int N= 25;
        int K = 4;
        int quotient = 0;
        while(N>= K) {
            N= N- K;
            quotient++;
        }

        System.out.println(quotient);
        System.out.println(N);
    }
}
