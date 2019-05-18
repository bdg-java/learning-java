package com.homework;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a");
        int a = scanner.nextInt();
        System.out.println("Insert b");
        int b = scanner.nextInt();
        System.out.println("Insert c");
        int c = scanner.nextInt();

        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0)
            System.out.println(1);
        else
            System.out.println(2);

    }
}
