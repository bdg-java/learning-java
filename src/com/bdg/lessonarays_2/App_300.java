package com.bdg.lessonarays_2;

import com.bdg.lessonarrays.IntegerArrayOperations;

import java.util.Arrays;

public class App_300 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int k = 100;
        int count = 0;
        for (int i=0;i<array.length;i++) {
            if(Math.pow(array[i],2)>k){
                count++;
            }
        }
        int[] array_new = new int[count];
        int j = 0;
        for (int i = 0; i<array.length; i++) {
            if (Math.pow(array[i],2)>k) {
                array_new[j]=array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array_new));
    }
}
