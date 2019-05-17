package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_218 {
    public static void main (String []args){

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int sum = 0;

        for (int i = 0; i < array.length; i++){
            if (i%2 != 0){
                sum += Math.abs(array[i]);
            }
        }
        System.out.println(sum);
    }
}
