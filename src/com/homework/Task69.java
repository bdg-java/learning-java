package com.homework;

public class Task69 {

    public static void main(String[] args){

        int a = (int) (Math.random() * 10000);

        int points = a % 10;
        int tens = a % 100 / 10;
        int hundreds = a % 1000 / 100;
        int thousands = a / 1000;

        System.out.println(a);

        int sum = points + tens + hundreds + thousands;
        int y;

        if (sum > 20)
            y = 1;
        else
            y = 0;

        System.out.println(y);
    }

}
