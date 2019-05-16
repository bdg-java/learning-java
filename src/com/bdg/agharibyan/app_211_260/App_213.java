package com.bdg.agharibyan.app_211_260;

/**
 * @author Ani Gharibyan
 */
import com.bdg.agharibyan.IntegerArrayOperations;

public class App_213 {
    public static void main(String[] args) {

        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int sum = 0;
        int cout = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += Math.pow(array[i], 2);
                cout++;
            }
        }
        System.out.println(Math.sqrt(sum / cout));
    }
}
