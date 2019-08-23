package com.bdg.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int in, out;
        int[] array = {12, 2, 1, 4, 8, 20, 10};
        System.out.println(Arrays.toString(array));

        for (out = 0; out < array.length; out++) {
//            int min = array[i];
            for (in = out + 1; in < array.length; in++) {
                if (array[out] > array[in]) {
                    swap(array, in, out);
                    /*int tmp = array[i] ;
                    array[i] = array[k];
                    array[k] = tmp;*/
                }
            }

        }
        System.out.println(Arrays.toString(array));



    }
    public static void swap ( int[] array, int ind1, int ind2){
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}


