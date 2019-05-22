package com.homework271_280;

import java.util.Scanner;

public class Task279 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert length of chars' array: ");
        int n = scanner.nextInt();

        char[] arr = CharArrayManipulation.randomArray(n);

        CharArrayManipulation.arrayPrint(arr);

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 'k') {
                count++;
            }
        }

        char[] newArrWithoutD = new char[count];

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 'k') {
                newArrWithoutD[k] = arr[i];
            } else {
                k--;
            }
            k++;
        }

        System.out.println();
        CharArrayManipulation.arrayPrint(newArrWithoutD);

    }
}
