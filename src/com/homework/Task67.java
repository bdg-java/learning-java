package com.homework;

public class Task67 {

    public static void main(String[] args){

        int a = (int) (Math.random() * 10000);

        int points = a % 10;
        int tens = a % 100 / 10;
        int hundreds = a % 1000 / 100;
        int thousands = a / 1000;

        System.out.println(a);

        int sum = points + tens + hundreds + thousands;

        System.out.println(Math.pow(sum, 2.0) == a ? "YES" : "NO");
    }

}
