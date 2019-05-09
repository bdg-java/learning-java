package com.lesson2;

public class Task65 {
    public static void main(String[] args) {
        int a = 4435;
        if ((a % 10) * (a % 100 / 10) == 12)
            System.out.print("y = 12");
        else
            System.out.print("y = 0");
    }
}
