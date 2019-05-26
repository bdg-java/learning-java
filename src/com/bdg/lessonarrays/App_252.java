package com.bdg.lessonarrays;

public class App_252 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);

        int minValue = array[0];
        for (int i=0;i<array.length;i++) {
            if(array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println(minValue);
    }
}
