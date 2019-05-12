package com.bdg.lesson_51_70;

public class App_63 {
    public static void main(String[] args) {
        int abcd = 1530;
        int a = abcd / 1000;
        int b = (abcd / 100) % 10;
        int c = (abcd % 100) / 10;
        int d = abcd % 10;

        if(a == 1 || b == 1 || c == 1 || d == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
