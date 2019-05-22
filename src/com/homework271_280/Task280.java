package com.homework271_280;

import java.util.Scanner;

public class Task280 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert length of chars' array: ");
        int n = scanner.nextInt();

        char[] arr = CharArrayManipulation.randomArray(n);

        CharArrayManipulation.arrayPrint(arr);

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'f') {
                count++;
            }
        }

        int newArrLength = arr.length + count;

        char[] newArr = new char[newArrLength];

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 'f') {
                newArr[k] = arr[i];
            } else {
                newArr[k] = arr[i];
                k++;
                newArr[k] = arr[i];
            }
            k++;
        }

        System.out.println();
        CharArrayManipulation.arrayPrint(newArr);
    }
}
