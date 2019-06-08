package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_244 {
    public static void main(String[] args) {

        int []array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int artadryal = 1;

        for (int i = 0; i < array.length; i++){
            if(array[i]%5 == 2){
                artadryal = artadryal * array[i];
            }
        }
        System.out.println(artadryal);
    }
}
