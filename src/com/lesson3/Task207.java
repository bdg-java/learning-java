package com.lesson3;

public class Task207 {
    public static void main(String[] args) {
        int a = 131101;
        boolean t = false;
        while (a > 0) {
            if (a % 10 == 2) {
                t = true;
                break;
            }
            a = a / 10;
        }
        System.out.println(t);
    }
}
