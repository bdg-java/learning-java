package com.bdg.exercises_151_210;

public class App_173 {
    public static void main(String[] args) {
        int n = 14;
        int a = 5;
        int b = 8;
        double x = (double) (b - a) / n;

        for (double i = a; i <= b; i += x) {
            System.out.println(i);
        }
    }
}
