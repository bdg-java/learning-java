package com.homework251_260;

import com.homework2.ArrayManypulations;

public class Task255 {
    public static void main(String[] args) {

        int[] staticArray = ArrayManypulations.createStaticArray();

        int maxNumnerIndex = 0;
        int maxNumber = staticArray[0];

        for (int i = 0; i < staticArray.length; i++) {
            if (maxNumber < staticArray[i]) {
                maxNumber = staticArray[i];
                maxNumnerIndex  = i;
            }
        }

        System.out.printf("Max number is: %d\nMax number index is: %d\nSum of them is: %d", maxNumber, maxNumnerIndex, maxNumber + maxNumnerIndex);
    }
}
