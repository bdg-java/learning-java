package com.homework421_440;

import java.util.Scanner;

public class Task424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int len = scanner.nextInt();

        int[][] arr = DualArrayManipulation.arr(len);
        DualArrayManipulation.arrayPrint(arr);

        double aver = 0;
        double count = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i + 1 == j) {
                    break;
                } else if (arr[i][j] != 0 && arr[i][j] % 2 != 0) {
                    aver = aver + arr[i][j];
                    count++;
                }
            }
        }

        System.out.println(aver / count);

    }
}
