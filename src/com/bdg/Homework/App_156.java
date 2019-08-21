package com.bdg.Homework;

public class App_156 {
    public static void main(String[] args) {

        int x = 5;
        int y = 6;
        int sum = 1;
        int num = 1000;

        for (int i = 1; i < num; i++) {
            if (i % x == 0 && i % y == 0)
                System.out.println(i);
            sum *= i;
        }
        System.out.println(sum);
    }
}
