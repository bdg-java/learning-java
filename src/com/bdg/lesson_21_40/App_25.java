package com.bdg.lesson_21_40;

public class App_25 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 100;

        if ((a + b < c) && (b + c > a) && (a + c > b)) {
            System.out.println("y = 1");
        } else {
            System.out.println("y = 2");
        }
    }
}
