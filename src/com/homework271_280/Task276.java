package com.homework271_280;

import java.util.Scanner;

public class Task276 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert length of chars' array: ");
        int n = scanner.nextInt();

        char[] arr = CharArrayManipulation.randomArray(n);

        CharArrayManipulation.arrayPrint(arr);

        boolean t = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'r') {
                t = true;
                break;
            }
        }

        System.out.printf("\n%b", t);
    }

}
