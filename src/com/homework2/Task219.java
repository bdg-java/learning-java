package com.homework2;

import java.util.Scanner;

public class Task219 {
    public static void main(String[] args) {
        int[] randomArr = ArrayManypulations.createRandomArray(11);
        Scanner scanner = new Scanner(System.in);

        for (int x: randomArr) {
            System.out.printf("%d, ", x);
        }
        System.out.println();


        System.out.print("Insert number: ");
        int k = scanner.nextInt(10);

        int count = 0;

        for (int i = 1; i < randomArr.length; i++) {
            if (k / i == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
