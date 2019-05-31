package com.bdg.nhakobyan.lesson_6.exercisesFrom_321;

import java.util.Arrays;

public class exercise_326 {
    public static void main(String[] args) {
        int[] array = {10, 13, 25, 5, 12, 2, 22, 4, 32, 7};
        System.out.print(Arrays.toString(array));
        int start = 0;
        int end = array.length-1;
        int temp = 0;
        int count = 0;
        for (int i = 1; i <array.length ; i++) {
            count++;
        }
        for (int i = 0; i < array.length ; i++) {
            if (start < end ) {
                temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
        System.out.print("\n"+Arrays.toString(array));
    }
}
