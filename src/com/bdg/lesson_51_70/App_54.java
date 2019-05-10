package com.bdg.lesson_51_70;

public class App_54 {
    public static void main(String[] args) {
        boolean t;
        int abc = 435;
        int c = abc % 10;
        int a = abc / 100;
        int ab = abc / 10;
        int b = ab % 10;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
