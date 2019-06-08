package com.bdg.agharibyan.app_291_300;

import com.bdg.agharibyan.IntegerArrayOperations;

import java.util.Arrays;

public class App_291 {

    public static void main(String[] args) {

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int n = 10;

        int qanak = 0;
        for(int i = 0; i < array.length; i++){
            if ( array[i] <= 0){
                qanak++;
            }
        }
        int [] x = new int [qanak];
        int j = 0;

        for ( int i = 0; i < array.length; i++){
            if ( array[i] <= 0){
                x[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
