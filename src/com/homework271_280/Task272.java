package com.homework271_280;

import java.util.Scanner;

public class Task272 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert length of chars' array: ");
        int n = scanner.nextInt();

        char[] arr = CharArrayManipulation.randomArray(n);

        CharArrayManipulation.arrayPrint(arr);

        boolean t = false;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'b') {
                count++;
            }
        }

        if (count == n / 2) {
            t = true;
            System.out.println();
            System.out.println(t);
        } else {
            System.out.println();
            System.out.println(t);
        }
    }
}
