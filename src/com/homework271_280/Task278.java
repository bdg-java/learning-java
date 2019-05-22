package com.homework271_280;

import java.util.Scanner;

public class Task278 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert length of chars' array: ");
        int n = scanner.nextInt();

        char[] arr = CharArrayManipulation.randomArray(n);

        CharArrayManipulation.arrayPrint(arr);

        int newArrLength = arr.length / 2;

        char[] newOddsArr = new char[newArrLength];

        for (int i = 1, k = 0; i < newOddsArr.length; i = i + 2, k++) {
            newOddsArr[k] = arr[i];
        }

        System.out.println();
        CharArrayManipulation.arrayPrint(newOddsArr);
    }

}
