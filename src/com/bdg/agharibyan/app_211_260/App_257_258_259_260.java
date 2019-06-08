package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_257_258_259_260 {
    public static void main(String[]args){

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int arajinmax = array[0];
        int arajinmaxindex = 0;
        int verjinmax = array[array.length-1];
        int verjinmaxindex = 0;
        int arajinmin = array[0];
        int arajinminindex = 0;
        int verjinmin = array[array.length-1];
        int verjinminindex = 0;

        for (int i = 1; i < array.length; i++){
            if (array[i] > arajinmax) {
                arajinmax = array[i];
                arajinmaxindex = i;
            }
        }
        System.out.println("arajinmaxindex:"+arajinmaxindex);

        for (int i = array.length-2; i >= 0; i--){
            if (array[i] > verjinmax) {
                verjinmax = array[i];
                verjinmaxindex = i;
            }
        }
        System.out.println("verjinmaxindex:"+verjinmaxindex);

        for (int i = 1; i < array.length; i++){
            if (array[i] < arajinmin) {
                arajinmin = array[i];
                arajinminindex = i;
            }
        }
        System.out.println("arajinminindex:"+arajinminindex);

        for (int i = array.length-2; i >= 0; i--){
            if (array[i] < verjinmin) {
                verjinmin = array[i];
                verjinminindex = i;
            }
        }
        System.out.println("verjinminindex:"+verjinminindex);

    }
}
