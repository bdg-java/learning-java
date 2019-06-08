package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_241_242_243 {
    public static void main(String[] args) {

        int []array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int k = 3;
        int gumar = 0;
        int artadryal = 1;
        int qanak = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] != 0){
                if (array[i]%k == 0){
                    gumar += array[i];
                    artadryal = artadryal * array[i];
                    qanak++;
                }
            }
        }
        System.out.println("Gumar:"+gumar);
        System.out.println("Artadryal:"+artadryal);
        System.out.println("Qanak:"+qanak);
    }
}
