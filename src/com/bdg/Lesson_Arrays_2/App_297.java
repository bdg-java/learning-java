package com.bdg.Lesson_Arrays_2;

import com.bdg.lesson_Arrays.IntegerArrayOperations;

import java.util.Arrays;

public class App_297 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int k = 5;
        int count = 0;
        for (int i=0;i<array.length;i++) {
            if(Math.abs(array[i])>k){
                count++;
            }
        }
        int[] array_new = new int[count];
        int j = 0;
        for (int i = 0; i<array.length; i++) {
            if (Math.abs(array[i])>k) {
                array_new[j]=array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array_new));
    }
}
