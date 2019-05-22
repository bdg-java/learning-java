package com.homework421_440;

import java.util.Scanner;

public class Task434 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int len = scanner.nextInt();

        int[][] arr = DualArrayManipulation.arr(len);
        DualArrayManipulation.arrayPrint(arr);

        double rangeStart = 5.4;
        double rangeEnd = 15.3;

        int count = 0;

        for (int i = 0; i < len; i++) {
            for (int j = len - 1 - i; j < len; j++) {
                if (arr[i][j] >= rangeStart && arr[i][j] <= rangeEnd) {
                    count++;
                    System.out.println(arr[i][j]);
                }
            }
        }

        System.out.println(count);
    }
}
