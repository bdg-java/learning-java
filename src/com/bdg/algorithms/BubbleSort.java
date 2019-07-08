package com.bdg.algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {1,6,7,8,3,10};
        System.out.println(Arrays.toString(sort(array)));

    }


    public static  int[] sort(int[] array){
        for (int i =0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                        if(array[j] < array[i]){
                            int tmp = array[i];
                            array[i] = array[j];
                            array[j] = tmp;
                        }
            }
        }

        return array;
    }
}
