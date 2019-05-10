package com.bdg.lesson_51_70;

public class App_52 {
    public static void main(String[] args) {
        boolean t;
        int abc = 221;
        int c = abc % 10;
        int a = abc / 100;
        int ab = abc / 10;
        int b = ab % 10;

        if (a == b ||  a == c || b == c) {
            t = true;
            System.out.println(t);
        } else {
            t = false;
            System.out.println(t);
        }
    }
}
