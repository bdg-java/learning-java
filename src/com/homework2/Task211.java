package com.homework2;

public class Task211 {
    public static void main(String[] args) {
        int[] randomArr = ArrayManypulations.createRandomArray(11);

        int sum = 0;

        for (int x: randomArr) {
            sum += x;
        }

        System.out.println(sum);

        double average = (double) sum / randomArr.length;

        System.out.println(average);
    }
}
