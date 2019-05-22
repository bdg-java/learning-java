package com.homework421_440;

import java.util.Scanner;

public class Task422 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int len = scanner.nextInt();

        int[][] arr = DualArrayManipulation.arr(len);
        DualArrayManipulation.arrayPrint(arr);

        int count = 0;

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    break;
                } else if (arr[i][j] != 0 && arr[i][j] % 5 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}