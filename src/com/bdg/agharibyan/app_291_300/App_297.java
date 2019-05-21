package com.bdg.agharibyan.app_291_300;

import com.bdg.agharibyan.IntegerArrayOperations;

import java.util.Arrays;

public class App_297 {
    public static void main(String[] args) {

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int k = 6;
        int qanak = 0;
        for(int i = 0; i < array.length; i++){
            if(Math.abs(array[i]) <= k){
                qanak++;
            }
        }
        int j = 0;
        int [] x = new int [qanak];
        for(int i = 0; i < array.length; i++){
            if(Math.abs(array[i]) <= k){
                x[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
