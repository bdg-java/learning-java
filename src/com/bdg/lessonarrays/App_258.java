package com.bdg.lessonarrays;

public class App_258 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);

        int sum = 0;
        int maxValue = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxValue && i > index) {
                index = i;
                maxValue = array[i];
            }
        }
        System.out.println(index);
    }
}
