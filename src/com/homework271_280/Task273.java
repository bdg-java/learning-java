package com.homework271_280;

import java.util.Scanner;

public class Task273 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert length of chars' array: ");
        int n = scanner.nextInt();

        char[] arr = CharArrayManipulation.randomArray(n);

        CharArrayManipulation.arrayPrint(arr);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 's') {
                sum += i;
            }
        }

        System.out.printf("\n%d", sum);
    }
}
