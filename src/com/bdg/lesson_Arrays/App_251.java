package com.bdg.lesson_Arrays;

public class App_251 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);

        int maxValue = array[0];
        for (int i=0;i<array.length;i++) {
            if(array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);
    }
}
