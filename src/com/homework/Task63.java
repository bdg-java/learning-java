package com.homework;

public class Task63 {
    public static void main(String[] args){

        int a = (int) (Math.random() * 10000);

        int points = a % 10;
        int tens = a % 100 / 10;
        int hundreds = a % 1000 / 100;
        int thousands = a / 1000;

        System.out.println(a);

        if (points == 1 || tens == 1 || hundreds == 1 || thousands == 1)
            System.out.print(true);
        else
            System.out.println(false);
    }
}