package com.bdg.agharibyan.app_291_300;

import com.bdg.agharibyan.IntegerArrayOperations;

import java.util.Arrays;

public class App_293 {

    public static void main (String [] args){

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int a = 55;
        int b = 99;
        int qanak = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < a || array[i] > b){
                qanak++;
            }
        }
        int [] x = new int [qanak];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < a || array[i] > b){
                x[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
