package com.bdg.lesson_21_40;

public class App_34 {
    public static void main(String[] args) {
        int a = 4, b = 3, c = 4, d = 3;

        if ((a + b == c + d) || (a + c == b + d) || (a + d == b + c) ) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
