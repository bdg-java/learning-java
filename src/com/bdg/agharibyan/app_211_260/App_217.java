package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_217 {
    public static void main(String[] args){

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        double x = 1;

        for (int i = 0; i < array.length; i++){
            if (i%2 != 0){
                x = x * Math.pow(array[i],2);
            }
        }
        System.out.println(x);
    }
}
