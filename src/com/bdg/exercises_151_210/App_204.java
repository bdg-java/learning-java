package com.bdg.exercises_151_210;

public class App_204 {

    public static void main(String[] args) {
        int n = 2241;

        for (int i = 10; true; i *= 10) {
            System.out.println( n % i / (i / 10));
            if (n / i == 0) {
                break;
            }
        }

    }
}
