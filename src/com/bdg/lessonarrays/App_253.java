package com.bdg.lessonarrays;

public class App_253 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);

        int maxValue = array[0];
        int minValue = array[0];
        for (int i=0;i<array.length;i++) {
            if(array[i] > maxValue) {
                maxValue = array[i];
            }
            else if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println(minValue+maxValue);
    }
}
