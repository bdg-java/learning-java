package com.bdg.lesson_51_70;

public class App_51 {
    public static void main(String[] args) {
        boolean t;
        int abc = 123;
        int c = abc % 10;
        int a = abc / 100;
        int ab = abc / 10;
        int b = ab % 10;

        if (c == a + b) {
            t = true;
            System.out.println(t);
        } else {
            t = false;
            System.out.println(t);
        }
    }
}
