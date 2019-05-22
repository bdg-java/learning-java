package com.homework271_280;

import java.util.Scanner;

public class Task274 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert length of chars' array: ");
        int n = scanner.nextInt();

        char[] arr = CharArrayManipulation.randomArray(n);

        CharArrayManipulation.arrayPrint(arr);

        double sum = 0;
        double count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 'h') {
                sum += i;
                count++;
            }
        }

        System.out.printf("\n%f", (sum / count));
    }
}
