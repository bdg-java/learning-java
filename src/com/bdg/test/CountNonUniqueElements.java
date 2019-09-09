package com.bdg.test;

import java.util.Arrays;

public class CountNonUniqueElements {

    private static int [] array = {1,4,4,5,6,4,1,2,8,4,2,3,1,4,1,4};

    public static void main(String[] args){

        int count = 0;
        int nonUniqueElement = 0;

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        if(array.length >= 1 && array.length <= 1000){
            boolean isArrayValid = true;
            for(int i = 0; i < array.length; i++){
                if(array[i] < 1 || array[i] > 1000){
                    System.out.println("Array element is not valid.");
                    isArrayValid = false;
                    break;
                }
            }
            if(isArrayValid){
                for(int i = 0; i < array.length; i++) {
                    for(int j = i+1; j < array.length; j++){
                        if(array[i] == array[j] && array[i] != nonUniqueElement){
                            nonUniqueElement = array[i];
                            count++;
                            System.out.print(nonUniqueElement + " -> ");
                            System.out.println(count);
                        }
                    }
                }
            }
        }
    }
}