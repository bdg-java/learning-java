package com.bdg.agharibyan.app_211_260;
/**
 * @author Ani Gharibyan
 */
import com.bdg.agharibyan.IntegerArrayOperations;

public class App_251_252_253_254_255_256 {
    public static void main(String[] args) {

        int [] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);
        int max = array[0];
        int maxindex = -1;

        for(int i = 1; i < array.length; i++) {
            if (array[i] > array[0]) {
                max = array[i];
                maxindex = i ;
            }
        }
        System.out.println("max:"+max);
        System.out.println("max+maxindex:"+(max+maxindex));

        int min = array[0];
        int minindex = -1;

        for (int i = 1; i < array.length; i++){
            if (array[i]< min){
                min = array[i];
                minindex = i;
            }
        }
        System.out.println("min:"+min);
        System.out.println("min+minindex"+(min+minindex));
        System.out.println("min+max:"+(min+max));
        System.out.println("min*max:"+(min*max));

    }
}
