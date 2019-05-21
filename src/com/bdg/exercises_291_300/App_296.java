package com.bdg.exercises_291_300;

import com.bdg.exercises_211_260.IntegerArrayOperations;

import java.util.Arrays;

public class App_296 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int k = 8;
        int count = getCount(array,k);
        int[] newArray = new int[array.length - count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (k % array[i] != 2) {
                newArray[index] = array[i];
                index++;
            }
        }


        System.out.println(Arrays.toString(newArray));
    }


    private static int getCount(int[] array,int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (k % array[i] == 2) {
                count++;
            }
        }

        return count;
    }
}
