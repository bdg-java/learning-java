package com.lesson2;

public class Task54 {
    public static void main(String[] args) {
        int a= 819;
        int max = a / 100;
        if(a/ 10 % 10 > max) max =  a/ 10 % 10;
        if(a % 10  > max) max = a % 10;
        System.out.print("Max = " + max);

    }
}
