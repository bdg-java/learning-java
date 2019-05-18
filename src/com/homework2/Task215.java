package com.homework2;

public class Task215 {
    public static void main(String[] args) {
        int[] randomArr = ArrayManypulations.createRandomArray(11);

        int sum = 0;

        for (int i = 2; i < randomArr.length; i += 2) {
            sum += randomArr[i];
        }

        System.out.print(sum);
    }
}
