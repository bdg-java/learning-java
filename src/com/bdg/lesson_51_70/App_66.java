package com.bdg.lesson_51_70;

public class App_66 {
    public static void main(String[] args) {
        int abcd = 1146;
        int a = abcd / 1000;
        int b = (abcd / 100) % 10;
        int c = (abcd % 100) / 10;
        int d = abcd % 10;

        if (b == 4 || c == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
