package com.bdg.Homework;

public class App_333 {
    public static void main(String[] args) {

        int[] X = {11, 32, -62, 7, -5, 12, 44, 78, -55, 12};
        int sum = 0;
        int n = 20;


        for (int i = 1; i < X.length - 1; i++) {
            if ((X[i - 1] + X[i + 1]) < n) {
                sum += X[i];
            }
        }
        System.out.println(sum);
    }
}
