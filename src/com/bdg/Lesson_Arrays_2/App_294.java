package com.bdg.Lesson_Arrays_2;

import com.bdg.lesson_Arrays.IntegerArrayOperations;

import java.util.Arrays;

public class App_294 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int count = 0;
        for (int i=0;i<array.length;i++) {
            if(i%2!=0){
                count++;
            }
        }
        int[] array_new = new int[count];

        int j = 0;
        for (int i = 0; i<array.length; i++) {
            if (i%2!=0) {
                array_new[j]=array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array_new));
    }
}
