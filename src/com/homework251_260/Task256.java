package com.homework251_260;

import com.homework2.ArrayManypulations;

public class Task256 {
    public static void main(String[] args) {

        int[] staticArray = ArrayManypulations.createStaticArray();

        int minNumberIndex = 0;
        int minNumber = staticArray[0];

        for (int i = 0; i < staticArray.length; i++) {
            if (minNumber > staticArray[i]) {
                minNumber = staticArray[i];
                minNumberIndex  = i;
            }
        }

        System.out.printf("Max number is: %d\nMax number index is: %d\nSum of them is: %d", minNumber, minNumberIndex, minNumber + minNumberIndex);
    }
}
