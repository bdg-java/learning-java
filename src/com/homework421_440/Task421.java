package com.homework421_440;

import java.util.Scanner;

public class Task421 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int len = scanner.nextInt();

        int[][] arr = DualArrayManipulation.arr(len);
        DualArrayManipulation.arrayPrint(arr);

        System.out.println();
        System.out.print("Enter number k: ");
        int k = scanner.nextInt();


        int count = 0;

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    break;
                } else if (k != 0 && arr[i][j] != 0 && arr[i][j] % k == 0) {
                    count++;
                }
            }
        }


        System.out.println(count);

    }
}
