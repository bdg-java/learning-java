package com.bdg.repetition.from151to190;

public class Task180 {

    public static void main(String[] args) {

        int N = 27;
        boolean answer = false;

        for (int i = 3; i <= N; i = i*i){
            if(N == i || Math.sqrt(N) == i){
                answer = true;
            }
        }
        System.out.println(answer);
    }

}
