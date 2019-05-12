package com.bdg.lesson_151_200;

public class App_151 {
    public static void main(String[] args) {
        int sum = 0;
        int N = 10;
        int n = 2;
        int i;

        for (i = 0; i<=N; i++)
            if (i % n == 0) {
                sum = sum + i;
            } System.out.println(sum);
    }
}
