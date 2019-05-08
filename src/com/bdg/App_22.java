package com.bdg;

public class App_22 {
    public static void main(String args[]) {
        int a = 12, b = 14, c = 3;
        if (a < b && a < c) {
            System.out.println("Minimum is " + a);
        } else if (b < c) {
            System.out.println("Minimum is " + b);
        } else {
            System.out.println("Minimum is " + c);
        }
    }
}
