package com.bdg.exercises_291_300;

import com.bdg.exercises_211_260.IntegerArrayOperations;

import java.util.Arrays;

public class App_292 {

    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int[] newArray = new int[getCountFromArray(array)];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 7 == 0) {
                newArray[count] = array[i];
                count++;
            }
        }

        System.out.println(Arrays.toString(newArray));

    }


    private static int getCountFromArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 7 == 0) {
                count++;
            }
        }

        return count;

    }
}
