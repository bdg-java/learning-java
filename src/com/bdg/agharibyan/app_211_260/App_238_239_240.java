package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_238_239_240 {
    public static void main(String[] args) {

        int []array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int qanak3 = 0;
        int qanak5 = 0;
        int qanak7 = 0;
        int gumar3 = 0;
        int gumar5 = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] != 0){
                if (array[i]%3 == 0){
                    qanak3++;
                    gumar3 += array[i];
                }
            }
        }
        System.out.println("Mijin tvabanakan:"+ gumar3/qanak3);

        for(int i = 0; i < array.length; i++){
            if (array[i] != 0){
                if (array[i]%5 == 0){
                    qanak5++;
                    gumar5 += Math.pow(array[i],2);
                }
            }
        }
        System.out.println("Mijin qarakusayin:"+ Math.sqrt(gumar5/qanak5));

        for(int i = 0; i < array.length; i++){
            if (array[i] != 0){
                if (array[i]%7 == 0){
                    qanak7++;
                }
            }
        }
        System.out.println("Qanak:"+ qanak7);
    }
}
