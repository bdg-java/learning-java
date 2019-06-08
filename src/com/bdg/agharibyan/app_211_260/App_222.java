package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_222 {
    public static void main(String[] args) {

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int c = 1;
        int d = 4;
        int x = 1;

        for (int i = c; i < d; i++){
            x = x * array[i];
        }
        System.out.println(x);
    }
}
