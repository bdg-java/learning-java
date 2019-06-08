package com.bdg.agharibyan.app_211_260;
/**
 * @author Ani Gharibyan
 */
import com.bdg.agharibyan.IntegerArrayOperations;

public class App_248_249_250 {
    public static void main(String[] args) {

        int []array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int gumar = 0;
        int k = 3;

        for (int i = 0; i < array.length; i++){
            if (Math.pow(array[i]+i,2)%k == 0){
                gumar += array[i];
            }
        }
        System.out.println("gumar:"+gumar);

        int qanak = 0;

        for (int i = 0; i < array.length; i++){
            if (Math.abs(array[i]-i) > k){
                qanak ++;
            }
        }
        System.out.println("qanak:"+qanak);

        double artadryal = 1;

        for (int i = 0; i < array.length; i++){
            if((array[i]*i)%3 == 2){
                artadryal = artadryal * Math.pow(array[i],2);
            }
        }
        System.out.println("artadryal:"+artadryal);
    }
}
