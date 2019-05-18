package com.homework251_260;

import com.homework2.ArrayManypulations;

public class Task258 {

    public static void main(String[] args) {
        int[] randomArray = ArrayManypulations.createRandomArray(10);

        for (int x: randomArray) {
            System.out.printf("%d, ", x);
        }

        System.out.println();

        int maxNumber = ArrayManypulations.maxNumber(randomArray);
        int maxNumberIndex = 0;

        System.out.println(maxNumber);

        for (int i = randomArray.length - 1; i > 0; i--) {
            if (maxNumber == randomArray[i]) {
                maxNumberIndex = i;
                break;
            }
        }

        System.out.println(maxNumberIndex);

        System.out.printf("Max number index is: %d", maxNumberIndex);
    }

}
