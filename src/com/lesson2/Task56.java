package com.lesson2;

public class Task56 {
    public static void main(String[] args) {
        int a= 534, sum = 0;
        sum = a % 10 +  a / 100 +  a/ 10 % 10;
        if (a % 10 > a/ 10 % 10)
            System.out.print ((float)sum/a);
        else
            System.out.print (a);

    }
}
