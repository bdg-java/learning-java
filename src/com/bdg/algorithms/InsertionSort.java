package com.bdg.algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array ={32534,5,65,6,76,1,8};
        System.out.println(Arrays.toString(sort(array)));
    }

//implement
     static int[] sort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                j=j-1;
            }
            arr[j+1] =key;

        }
        return  arr;
    }
}
