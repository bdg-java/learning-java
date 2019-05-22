package com.homework421_440;

import java.util.Scanner;

public class Task426 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int len = scanner.nextInt();

        int[][] arr = DualArrayManipulation.arr(len);
        DualArrayManipulation.arrayPrint(arr);

        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[i][j] != 0 && arr[i][j] % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
