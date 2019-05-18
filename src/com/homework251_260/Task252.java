package com.homework251_260;

import com.homework2.ArrayManypulations;

public class Task252 {
    public static void main(String[] args) {
        int[] randomArr = ArrayManypulations.createRandomArray(11);

        for (int x: randomArr) {
            System.out.printf("%d, ", x);
        }
        System.out.println();

        System.out.println(ArrayManypulations.minNumber(randomArr));
    }

}
