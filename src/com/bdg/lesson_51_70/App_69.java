package com.bdg.lesson_51_70;

public class App_69 {
    public static void main(String[] args) {
        int abcd = 8708;
        int a = abcd / 1000;
        int b = (abcd / 100) % 10;
        int c = (abcd % 100) / 10;
        int d = abcd % 10;
        int sum = a+b+c+d;

        if (sum > 20) {
            int y = 1;
            System.out.println(y);
        } else {
            int y = 0;
            System.out.println(y);
        }

    }
}
