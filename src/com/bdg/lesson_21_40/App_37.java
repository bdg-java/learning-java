package com.bdg.lesson_21_40;

public class App_37 {
    public static void main(String[] args) {

        int a = 1, b = 3, c = 5, d = 7;
        int d1 = b - a, d2 = c - b, d3 = d-c;

        if (d1 == d2 && d2 == d3) {
            System.out.print("TRUE");
        } else {
            System.out.print("FALSE");
        }
    }
}