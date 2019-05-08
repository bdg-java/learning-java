package com.bdg;

public class App_21 {

    public static void main(String args[]) {
        int a = 12, b = 121, c = 38;
        if (a > b && a > c) {
            System.out.println("Maximum is " + a);
        } else if (b > c) {
            System.out.println("Maximum is " + b);
        } else {
            System.out.println("Maximum is " + c);
        }
    }
}
