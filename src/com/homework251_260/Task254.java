package com.homework251_260;

import com.homework2.ArrayManypulations;

public class Task254 {

    public static void main(String[] args) {
        int[] randomArray = ArrayManypulations.createRandomArray(10);

        for (int x: randomArray) {
            System.out.printf("%d, ", x);
        }

        System.out.println();

        int maxNumber = ArrayManypulations.maxNumber(randomArray);
        int minNumber = ArrayManypulations.minNumber(randomArray);

        System.out.printf("Min number is: %d\n", minNumber);
        System.out.printf("Max number is: %d\n", maxNumber);

        System.out.printf("Mult of them is: %d", minNumber * maxNumber);
    }

}
