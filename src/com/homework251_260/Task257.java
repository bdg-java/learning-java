package com.homework251_260;

import com.homework2.ArrayManypulations;

public class Task257 {

    public static void main(String[] args) {
        int[] randomArray = ArrayManypulations.createRandomArray(10);

        for (int x: randomArray) {
            System.out.printf("%d, ", x);
        }

        System.out.println();

        int maxNumber = ArrayManypulations.maxNumber(randomArray);
        int maxNumberIndex = 0;

        for (int i = 0; i < randomArray.length; i++) {
            if (maxNumber == randomArray[i]) {
                maxNumberIndex = i;
                break;
            }
        }

        System.out.printf("Max number index is: %d", maxNumberIndex);
    }

}
