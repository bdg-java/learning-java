package com.lesson3;

public class Task173 {
    public static void main(String[] args) {
        int n = 3;
        double a = 0, b = 8, c = 0;
        double h = b / n;
        System.out.println("H = " + h);
        for (double i = a; i <= b; i += h) {
            c = a + i;
            System.out.println("Coordinate = " + c);
        }

    }
}
