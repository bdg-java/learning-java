package com.bdg.lesson_51_70;

public class App_61 {
    public static void main(String[] args) {
        int abcd = 2534;
        int a = abcd / 1000;
        int b = (abcd / 100) % 10;
        int c = (abcd % 100) / 10;
        int d = abcd % 10;
        boolean t;

        if (a + b == c + d) {
            t = true;
            System.out.println(t);
        } else {
            t = false;
            System.out.println(t);
        }

    }
}
