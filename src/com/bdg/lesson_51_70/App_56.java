package com.bdg.lesson_51_70;

public class App_56 {
    public static void main(String[] args) {
        boolean t;
        int abc = 131;
        int c = abc % 10;
        int a = abc / 100;
        int ab = abc / 10;
        int b = ab % 10;
        float x = a + b + c;
        float rel = x / abc;

        if (c > b) {
            System.out.println(rel);
        } else {
            System.out.println(abc);
        }
    }
}
