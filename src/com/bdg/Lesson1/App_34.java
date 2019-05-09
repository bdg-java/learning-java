package com.bdg.Lesson1;

public class App_34 {
    public static void main(String[] args) {

        int a = 23;
        int b = 35;
        int c = 75;
        int d = 44;

        if ((a + b == c + d)||(a + c == b + d)|| (a + d == b + c)) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }
}
