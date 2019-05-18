package com.homework;

public class Task65 {

    public static void main(String[] args){

        int a = (int) (Math.random() * 10000);

        int points = a % 10;
        int tens = a % 100 / 10;

        System.out.println(a);

        System.out.println(points * tens == 12 ? "y = 12" : "y = 0");


    }

}
