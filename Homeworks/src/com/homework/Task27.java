package com.homework;

import java.util.Scanner;

public class Task27 {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a");
        int a = scanner.nextInt();
        System.out.println("Insert b");
        int b = scanner.nextInt();
        System.out.println("Insert c");
        int c = scanner.nextInt();

        int max = 0;

        if (a > b) {
            if (a > c)
                max = a;
            else
                max = c;
        }
        else {
            if (b < c)
                max = c;
            else
                max = b;
        }

        int min = 0;

        if (a < b) {
            if (a < c)
                min = a;
            else
                min = c;
        }
        else {
            if (b > c)
                min = c;
            else
                min = b;
        }


        int mid = 0;

        if (a != min && a != max)
            mid = a;
        else if (b != min && b != max)
            mid = b;
        else if (c != min && c != max)
            mid = c;


        if (mid - min == max - mid)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
