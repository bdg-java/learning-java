package com.homework421_440;

import java.util.Scanner;

public class Task432 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int len = scanner.nextInt();

        int[][] arr = DualArrayManipulation.arr(len);
        DualArrayManipulation.arrayPrint(arr);

        int mult = 1;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if ((i + j) % 2 == 1) {
                    mult *= arr[i][j];
                }
            }
        }

        System.out.println(mult);
    }
}
