package com.homework;

public class Task66 {

    public static void main(String[] args){

        int a = (int) (Math.random() * 10000);

        int points = a % 10;
        int thousands = a / 1000;

        System.out.println(a);

        System.out.println(points == 4 || thousands == 4 ? "YES" : "NO");


    }

}
