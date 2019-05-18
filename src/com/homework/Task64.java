package com.homework;

public class Task64 {

    public static void main(String[] args){

        int a = (int) (Math.random() * 10000);

        int points = a % 10;
        int tens = a % 100 / 10;

        char y;

        System.out.println(a);

        if (points + tens == 5)
            y = 's';
        else
            y = 'd';

        System.out.println(y);


    }
}
