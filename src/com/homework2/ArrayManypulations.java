package com.homework2;

import java.util.Random;

public class ArrayManypulations {

    public static int[] createStaticArray() {
        int[] arr = {24, 12, 0, 56, 3, -5, -7, 56, 9, 10};

        return arr;
    }

    public static int[] createRandomArray(int size) {

        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        return arr;
    }

    public static int maxNumber(int[] arr) {
        int maxNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
            }
        }

        return maxNumber;
    }

    public static int minNumber(int[] arr) {
        int minNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (minNumber > arr[i]) {
                minNumber = arr[i];
            }
        }

        return minNumber;
    }
}