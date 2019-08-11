package com.bdg.repetition.from151to190;

public class Task172 {

    public static void main(String[] args) {

        int N = 6;
        int answer = 1;

        for(int i = N; i >= 1; i = i - 2){
            answer *= i;
        }
        System.out.println(answer);
    }

}
