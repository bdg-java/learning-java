package com.bdg.lesson_21_40;

public class App_32 {
    public static void main(String[] args) {
        int a = 7, b = 11, c = 10, d = 9;

        if (a < b) {
            if (a < c) {
                if (a < d) {
                    System.out.println("a is min: " + a);
                } else {
                    System.out.println("d is min: " + d);
                }
            } else {
                if (c < d) {
                    System.out.println("c is min: " + c);
                } else {
                    System.out.println("d is min: " + d);
                }
            }
        } else {
            if (b < c) {
                if (b < d) {
                    System.out.println("b is min: " + b);
                } else {
                    System.out.println("d is min: " + d);
                }
            } else {
                if (c < d) {
                    System.out.println("c is min: " + c);
                } else {
                    System.out.println("d is min: " + d);
                }
            }
        }
    }
}
