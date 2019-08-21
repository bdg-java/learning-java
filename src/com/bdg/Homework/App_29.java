package com.bdg.Homework;

public class App_29 {
    public static void main(String[] args) {

        int a = 444;
        int b = 44;
        int c = 4444;

        if (a > b) {
            if (b > c) {
                System.out.println(c + "," + b + "," + a);
            } else if (b < c)  System.out.println(c + "," + a + "," + b);
        }
        else if (b > c) {
            if (c > a) {
                System.out.println(a + "," + c + "," + b);
            }else if (c < a) System.out.println(c + "," + a + "," + b);
        }else if (c > b) {
            if (b > a) {
                System.out.println(a + "," + b + "," + c);
            }else if (b < a)System.out.println(b + "," + a + "," + c);
        }
    }
}
