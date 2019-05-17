package com.bdg.agharibyan.app_211_260;

import com.bdg.agharibyan.DoubleArrayOperations;
/**
 * @author Ani Gharibyan
 */
public class App_230 {
    public static void main (String [] args){

        double [] array = DoubleArrayOperations.getDefaultArray();
        DoubleArrayOperations.displayArray(array);
        int k = 3;
        int qarakusinerigumar = 0;
        int qanak = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                int x = (int)array[i];
                if (x%k == 0) {
                    qanak++;
                    qarakusinerigumar += Math.pow(array[i], 2);
                }
            }
        }
        System.out.print(Math.sqrt(qarakusinerigumar/qanak));
    }
}
