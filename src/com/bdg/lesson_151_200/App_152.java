package com.bdg.lesson_151_200;

public class App_152 {
    public static void main(String[] args) {
        int pr = 1 ;
        int N = 10;
        int n = 3;
        int i;

        for (i = 1; i<=N; i++)
            if (i % n == 0) {
                pr = pr * i;
            } System.out.println(pr);
    }
}
