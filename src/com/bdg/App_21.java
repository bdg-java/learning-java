package com.bdg;

public class App_21 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        if (a > b) {
            if (a > c) {
                System.out.println("a is the largest: " + a);
            } else {
                System.out.println("c is the largest: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("b is the largest: " + b);
            } else {
                System.out.println("c is the largest: " + c);
            }
        }
    }
}