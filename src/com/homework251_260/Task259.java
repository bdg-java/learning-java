package com.homework251_260;

import com.homework2.ArrayManypulations;

public class Task259 {

    public static void main(String[] args) {
        int[] randomArray = ArrayManypulations.createRandomArray(10);

        for (int x: randomArray) {
            System.out.printf("%d, ", x);
        }

        System.out.println();

        int minNumber = ArrayManypulations.minNumber(randomArray);
        int minNumberIndex = 0;

        for (int i = 0; i < randomArray.length; i++) {
            if (minNumber == randomArray[i]) {
                minNumberIndex = i;
                break;
            }
        }

        System.out.printf("Min number index is: %d", minNumberIndex);
    }

}
