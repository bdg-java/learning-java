package com.homework271_280;

import java.util.Scanner;

public class Task271 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert length of chars' array: ");
        int len = scanner.nextInt();

        char[] arr = CharArrayManipulation.randomArray(len);

        CharArrayManipulation.arrayPrint(arr);

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                count++;
            }
        }

        System.out.printf("\n\nChar 'a' is repeating %d time\n", count);
    }
}
