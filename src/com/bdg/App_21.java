package com.bdg;

public class App_21 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        if (a > b) {
            if (a > c) {
                System.out.println("Maximum :" + a);
            } else {
                System.out.println("Maximum :" + c);
            }
        } else {
            if (b > c) {
                System.out.println("Maximum :" + b);
            } else {
                System.out.println("Maximum :" + c);
            }
        }


    }
}
