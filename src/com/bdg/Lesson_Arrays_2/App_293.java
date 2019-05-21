package com.bdg.Lesson_Arrays_2;

import com.bdg.lesson_Arrays.IntegerArrayOperations;

import java.util.Arrays;

public class App_293 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int a = 1;
        int b = 7;

        int[] array_new = new int[b-a];

        int j = 0;
        for (int i = a;i<b;i++) {
               array_new[j]=array[i];
                j++;

        }
        System.out.println(Arrays.toString(array_new));
    }
}

