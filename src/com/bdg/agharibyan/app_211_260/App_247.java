package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_247 {
    public static void main(String[] args) {

        int []array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int qanak = 0;
        int gumar = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] > i){
                qanak++;
                gumar += Math.pow(array[i],2);
            }
        }
        System.out.println("Mijin qarakusayin:"+Math.sqrt(gumar/qanak));
    }
}
