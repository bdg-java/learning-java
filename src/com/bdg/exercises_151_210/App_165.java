package com.bdg.exercises_151_210;

public class App_165 {
    public static void main(String[] args) {
        boolean t = false;
        int n = 81;
        for (int i = 3; i <= n; i *= 3) {
            if (n == i) {
                t = true;
            }
        }

        System.out.println(t);

    }
}
