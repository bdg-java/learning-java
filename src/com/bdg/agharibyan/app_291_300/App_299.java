package com.bdg.agharibyan.app_291_300;

import com.bdg.agharibyan.IntegerArrayOperations;

import java.util.Arrays;

public class App_299 {
    public static void main(String[] args) {

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int qanak = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 == 0){
                qanak++;
            }
        }
        int j = 0;
        int [] x = new int [qanak];
        for (int i = 0; i < array.length; i++){
            if(array[i]%2 == 0){
                x[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
