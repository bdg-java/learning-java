package com.homework;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a");
        int a = scanner.nextInt();
        System.out.println("Insert b");
        int b = scanner.nextInt();
        System.out.println("Insert c");
        int c = scanner.nextInt();

        if (a == 1 || b == 1 || c == 1)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
