package com.bdg.lesson_51_70;

public class App_65 {
    public static void main(String[] args) {
        int abcd = 1726;
        int a = abcd / 1000;
        int b = (abcd / 100) % 10;
        int c = (abcd % 100) / 10;
        int d = abcd % 10;

        if (d*c == 12) {
            System.out.println("y=12");
        } else {
            System.out.println("y=0");
        }
    }
}
