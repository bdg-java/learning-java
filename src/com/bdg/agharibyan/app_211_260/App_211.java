package com.bdg.agharibyan.app_211_260;

/**
 * @author Ani Gharibyan
 */
import com.bdg.agharibyan.IntegerArrayOperations;

public class App_211 {
    public static void main(String[] args){

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int sum = 0;
        int cout = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i]>0){
                sum += array[i];
                cout ++;
            }
        }
        System.out.println((double) sum / cout);
    }
}
