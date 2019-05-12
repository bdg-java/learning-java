package com.bdg.lesson_51_70;

public class App_70 {
    public static void main(String[] args) {
        int abcd = 8779;
        int a = abcd / 1000;
        int b = (abcd / 100) % 10;
        int c = (abcd % 100) / 10;
        int d = abcd % 10;
        int pr = a*b*c*d;

        if (pr > 200) {
            int y = 0;
            System.out.println(y);
        } else {
            int y = 1;
            System.out.println(y);
        }

    }
}
