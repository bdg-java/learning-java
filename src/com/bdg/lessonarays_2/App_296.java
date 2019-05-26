package com.bdg.lessonarays_2;

import com.bdg.lessonarrays.IntegerArrayOperations;

import java.util.Arrays;

public class App_296 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int k = 5;
        int count = 0;
        for (int i=0;i<array.length;i++) {
            if(array[i]%k==2){
                count++;
            }
        }

        int[] array_new = new int[count];

        int j = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i]%k==2) {
                array_new[j]=array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array_new));
    }
}

