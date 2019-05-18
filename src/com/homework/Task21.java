package com.homework;

import java.util.Scanner;

public class Task21 {

    public static void maxNumber(int a, int b, int c) {
        if (a > b) {
            if (a > c)
                System.out.println("The biggest is: " + a);
            else
                System.out.println("The biggest is: " + c);
        }
        else {
            if (b < c)
                System.out.println("The biggest is: " + c);
            else
                System.out.println("The biggest is: " + b);
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

        maxNumber(a, b, c);
    }
}
