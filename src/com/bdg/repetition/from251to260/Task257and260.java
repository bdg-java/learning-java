package com.bdg.repetition.from251to260;

import java.util.Arrays;

public class Task257and260 {

    public static void main(String[] args) {

        int[]array = new int[]{15, -26, 50, 43, 11, 50, 38, 49, -26, 0};
        int max = array[0];
        int index = 0;
        System.out.println("Array is " + Arrays.toString(array));

        //257
        for(int i = 0; i < array.length-1; i++){
            if(max < array[i]){
                max = array[i];
                index = i;
            }
        }
        System.out.println("Arajin metsaguyn tarri hamar: " + index);

        //260
        int min = array[0];
        index = 0;
        for(int i = 0; i < array.length-1; i++){
            if(min >= array[i]){
                min = array[i];
                index = i;
            }
        }
        System.out.println("Verjin poqraguyn tarri hamar: " + index);
    }

}
