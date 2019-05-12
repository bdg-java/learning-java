package com.bdg.lesson_51_70;

public class App_68 {
    public static void main(String[] args) {
        int abcd = 8701;
        int a = abcd / 1000;
        int b = (abcd / 100) % 10;
        int c = (abcd % 100) / 10;
        int d = abcd % 10;

        if(d > c) {
            System.out.println(d*b);
        } else {
            System.out.println(1);
        }
    }
}
