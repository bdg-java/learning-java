package com.homework;

import java.util.Scanner;

public class Task22 {

    public static void minNumber(int a, int b, int c) {

        if (a < b) {
            if (a < c)
                System.out.println("The smallest is: " + a);
            else
                System.out.println("The smallest is: " + c);
        }
        else {
            if (b > c)
                System.out.println("The smallest is: " + c);
            else
                System.out.println("The smallest is: " + b);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a");
        int a = scanner.nextInt();
        System.out.println("Insert b");
        int b = scanner.nextInt();
        System.out.println("Insert c");
        int c = scanner.nextInt();

        minNumber(a, b, c);
    }
}
