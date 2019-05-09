package com.lesson2;

public class Task61 {
    public static void main(String[] args) {


        int a = 1232;
        boolean t = false;
        if (a % 10 + a % 100 / 10 == a / 1000 + a / 100 % 10)
            t = true;
        else t = false;
        System.out.print(t);
    }
}
