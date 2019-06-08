package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.IntegerArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_246 {
    public static void main(String[] args) {

        int []array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int gumar = 0;
        int qanak = 0;

        for (int i = 0; i < array.length; i++){
            if (Math.sqrt(i)%1 == 0)
                qanak++;
                gumar += array[i];
        }
        System.out.println("Mijin tvabanakan:"+gumar/qanak);
    }
}
