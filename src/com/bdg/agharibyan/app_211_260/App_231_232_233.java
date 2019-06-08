package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_231_232_233 {
    public static void main(String[] args) {

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int sum = 0;
        int qanak = 0;
        int artadryal = 1;
        int gumar = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i]%2 == 0){
                sum += Math.pow(array[i],2);
                qanak++;
                artadryal = artadryal * array[i];
                gumar += array[i];
            }
        }
        System.out.println("Qarakusineri gumar:"+sum);
        System.out.println("Qanak:"+qanak);
        System.out.println("Artadryal:"+artadryal);
        System.out.println("Gumar:"+gumar);
    }
}
