package com.bdg.exercises_291_300;

import com.bdg.exercises_211_260.IntegerArrayOperations;

import java.util.Arrays;

public class App_293 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int a = 2;
        int b = 7;
        int[] newArray = new int[b-a+1];
        int index = 0;
        for (int i =a;i<=b;i++){
            newArray[index] = array[i];
            index++;
        }

        System.out.println(Arrays.toString(newArray));
    }
}
