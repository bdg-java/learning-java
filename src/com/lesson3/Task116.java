package com.lesson3;

public class Task116 {
    public static void main(String[] args) {
        double sum = 0;
        int x = 2;
        for (int n = 1; n < 5; n++) {
            sum += Math.pow((2 * x + 1), n) / ((n + 5) * Math.log(x * x + 1));
        }
        System.out.println(sum);
    }
}
