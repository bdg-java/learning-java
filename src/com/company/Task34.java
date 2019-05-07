package com.company;

public class Task34 {
    public static void main(String[] args) {
        int a = 1, b = 18, c = 15, d = 2;
        if (a + b  == c + d)
            System.out.println("True");
        else if (a + c == b + d)
            System.out.println("True");
        else if (a + d == c + d)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
