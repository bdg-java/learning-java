package com.bdg.exercises_291_300;

import com.bdg.exercises_211_260.IntegerArrayOperations;

import java.util.Arrays;

public class App_291 {

    public static void main(String[] args) {
        int[] defaultArray = IntegerArrayOperations.getDefaultArray();
        int count = getCountOfNegativeValues(defaultArray);
        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < defaultArray.length; i++) {
            if (defaultArray[i] > 0) {
                newArray[index] = defaultArray[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));

    }


    private static int getCountOfNegativeValues(int[] defaultArray) {
        int count = 0;
        for (int i = 0; i < defaultArray.length; i++) {
            if (defaultArray[i] > 0) {
                count++;
            }
        }
        return count;
    }
}
