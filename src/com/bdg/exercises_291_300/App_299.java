package com.bdg.exercises_291_300;

import com.bdg.exercises_211_260.IntegerArrayOperations;

import java.util.Arrays;

public class App_299 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int count = getCount(array);
        int[] newArray = new int[array.length - count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }


    private static int getCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
