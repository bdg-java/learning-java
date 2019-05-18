package com.homework;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a");
        int a = scanner.nextInt();
        System.out.println("Insert b");
        int b = scanner.nextInt();
        System.out.println("Insert c");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a)
            System.out.println("y = 1");
        else
            System.out.println("y = 2");
    }
}
