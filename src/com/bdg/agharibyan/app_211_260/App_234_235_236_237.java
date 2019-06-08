package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_234_235_236_237 {
    public static void main(String[] args) {

        int []array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int gumar =0;
        int qanak = 0;
        int artadryal = 1;
        int sum = 0;
        int zroyiqanak = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i]%2 != 0){
                qanak++;
                gumar += array[i];
                artadryal = artadryal * array[i];
                sum += Math.pow(array[i],2);
            }
        }
        System.out.println("Mijin tvabanakan:"+gumar/qanak);
        System.out.println("Mijin qarakusayin:"+Math.sqrt(sum/qanak));
        System.out.println("Qanak:"+qanak);
        System.out.println("Artadryal:"+artadryal);

        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                zroyiqanak ++;
            }
        }
        System.out.println("Zroyi qanak:"+zroyiqanak);
    }
}
