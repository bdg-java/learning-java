package com.homework;

public class Task68 {

    public static void main(String[] args){

        int a = (int) (Math.random() * 10000);

        int points = a % 10;
        int tens = a % 100 / 10;
        int hundreds = a % 1000 / 100;

        System.out.println(a);

        System.out.println(points > tens ? points * hundreds : 1);
    }

}
