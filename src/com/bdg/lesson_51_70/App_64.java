package com.bdg.lesson_51_70;

public class App_64 {
    public static void main(String[] args) {
        int abcd = 1705;
        int a = abcd / 1000;
        int b = (abcd / 100) % 10;
        int c = (abcd % 100) / 10;
        int d = abcd % 10;

        if (c + d == 5) {
            char y = 's';
            System.out.println(y);
        } else {
            char y = 'd';
            System.out.println(y);
        }
    }
}
