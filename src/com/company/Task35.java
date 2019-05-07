package com.company;

public class Task35 {
    public static void main(String[] args) {
        int a = 1, b = 18, c = 19, d = 2;
        if (a == b + c + d)
            System.out.println("True");
        else if (b == a + c + d)
            System.out.println("True");
        else if (c == a + b + d)
            System.out.println("True");
        else if (d == a + b + c)
            System.out.println("True");
        else System.out.println("False");

    }
}
