package com.bdg.exercises_291_300;

import com.bdg.exercises_211_260.IntegerArrayOperations;

import java.util.Arrays;

public class App_294 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();

        int[] newArray = new int[array.length/2];
        int index = 0;
        for (int i =1;i<array.length;i+=2){
            newArray[index] = array[i];
            index++;
        }

        System.out.println(Arrays.toString(newArray));
    }
}
