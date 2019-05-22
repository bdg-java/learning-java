package com.homework421_440;

import java.util.Scanner;

public class Task436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int len = scanner.nextInt();

        int[][] arr = DualArrayManipulation.arr(len);
        DualArrayManipulation.arrayPrint(arr);

        System.out.print("Enter range start point: ");
        int rangeStart = scanner.nextInt();
        System.out.print("Enter range end point: ");
        int rangeEnd = scanner.nextInt();

        double count = 0;
        double sum = 0;

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    break;
                } else if (arr[i][j] >= rangeStart && arr[i][j] <= rangeEnd){
                    sum += arr[i][j];
                    count++;
                    System.out.println(arr[i][j]);
                }
            }
        }

        System.out.println(sum / count);
    }
}
