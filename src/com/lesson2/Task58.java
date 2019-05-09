package com.lesson2;

public class Task58 {
    public static void main(String[] args) {
        int a = 160;
        char f;
        if (a / 100 +  a / 10 % 10  <  5)
            f = 'a';
        else f = 'b';
        System.out.print("f = " + f);
    }
}
