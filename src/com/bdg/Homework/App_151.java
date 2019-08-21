package com.bdg.Homework;

public class App_151 {
    public static void main(String[] args) {

        int n = 3;
        int num = 1000;
        int sum = 0;

        for (int i = 0; i < num; i++) {
            if (i % n == 0)
                System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}
