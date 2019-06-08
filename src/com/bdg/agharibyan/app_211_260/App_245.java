package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_245 {
    public static void main(String[] args) {

        int []array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int gumar = 0;

        for (int i = 0; i < array.length; i++){
            if ((array[i]+i)%3 == 0){
                gumar += Math.pow(array[i],2);
            }
        }
        System.out.println("Qarakusineri gumar:"+gumar);
    }
}
