package com.bdg.exercises_21_40;

public class App_34 {
    public static void main(String args[]) {
        int a = 37, b = 59, c = 55, d = 96;

        if (a + b == c + d || a + c == b + d || a + d == b + c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
