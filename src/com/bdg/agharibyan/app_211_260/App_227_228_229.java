package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_227_228_229 {
    public static void main(String[] args) {

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int k = 2;
        int qanak = 0;
        int gumar = 0;

        for (int i = k; i < array.length; i++){
            if (i%k == 0){
                qanak++;
                gumar += array[i];
            }
        }
        System.out.println("mijin tvabanakan:"+(double)gumar/qanak);
        System.out.println("gumar:"+gumar);

        int x = 1;
        for (int i = 0; i < array.length; i++){
            if (array[i]-i > 0){
                x = x * array[i];
            }
        }
        System.out.println("artadryal:"+x);
    }
}
