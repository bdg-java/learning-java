package com.bdg.exercises_151_210;

public class App_166 {
    public static void main(String[] args) {
        short y = 0;
        int n = 12;
        for (int i = 4; i <= n; i *= 4) {
            if (n == i) {
                y = 1;
            }
        }

        System.out.println(y);
    }
}
