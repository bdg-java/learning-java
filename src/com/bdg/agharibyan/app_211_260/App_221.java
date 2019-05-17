package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_221 {
    public static void main (String []main){

        int []array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int a = 2;
        int b = 8;
        int sum = 0;

        for (int i = a; i <= b; i++){
            sum += array[i];
        }
        System.out.println(sum);
    }
}
