package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;

/**
 * @author Ani Gharibyan
 */
public class App_216 {
    public static void main(String[] args){

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        long x = 1;

        for (int i = 0; i < array.length; i++){
            if (i%2 == 0){
                x = x * array[i];
            }
        }
        System.out.println(x);
    }

}
