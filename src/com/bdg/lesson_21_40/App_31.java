package com.bdg.lesson_21_40;

public class App_31 {
    public static void main(String[] args) {
        int a = 17, b = 11, c = 10, d = 9;

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.println("a is the largest: " + a);
                } else {
                    System.out.println("d is the largest: " + d);
                }
            } else {
                if (c > d) {
                    System.out.println("c is the largest: " + c);
                } else {
                    System.out.println("d is the largest: " + d);
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    System.out.println("b is the largest: " + b);
                } else {
                    System.out.println("d is the largest: " + d);
                }
            } else {
                if (c > d) {
                    System.out.println("c is the largest: " + c);
                } else {
                    System.out.println("d is the largest: " + d);
                }
            }
        }
    }
}