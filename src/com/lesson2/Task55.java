package com.lesson2;

public class Task55 {
    public static void main(String[] args) {
        int a= 102;
        int min = a / 100;
        if(a/ 10 % 10 < min) min =  a/ 10 % 10;
        if(a % 10 < min) min = a % 10;
        System.out.print("Min = " + min);
    }
}
