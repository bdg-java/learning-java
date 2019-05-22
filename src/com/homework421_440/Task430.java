package com.homework421_440;

import java.util.Scanner;

public class Task430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int len = scanner.nextInt();

        int[][] arr = DualArrayManipulation.arr(len);
        DualArrayManipulation.arrayPrint(arr);

        double sum = 0;
        double count = 0;

        for (int i = 0; i < len; i++) {
            for (int j = len - 1 - i; j < len; j++) {
                if (arr[i][j] != 0 && arr[i][j] % 2 == 0) {
                    count++;
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum / count);
    }
}
