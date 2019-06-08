package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_220 {
    public static void main (String []main){

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int d = 0;
        int b = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i]>0){
                d++;
            } else if(array[i]<0){
                b++;
            }
        }
        System.out.println("drakan"+d+", bacasakan"+b);
    }
}
