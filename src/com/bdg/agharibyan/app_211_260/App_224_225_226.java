package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_224_225_226 {
    public static void main(String[] args) {

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int k = 7;
        int x = 0;
        int y = 1;
        int z = 0;

        for (int i = 0; i < array.length; i++){
            if (Math.abs(array[i]) < k){
                x += Math.pow(array[i],3);
                y = y * array[i];
                z ++;
            }
        }
        System.out.println("artadryal:" + x);
        System.out.println("artadryal:" + y);
        System.out.println("qanak:" + z);
    }
}
