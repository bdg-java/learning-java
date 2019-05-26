package com.bdg.lessonarrays;

public class App_257 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);

        int sum = 0;
        int maxValue = array[0];
        int index = array.length;
        for (int i = array.length; i < 0; i--) {
            if (array[i] >= maxValue && i < index) {
                index = i;
                maxValue = array[i];
            }
        }
        System.out.println(index);
    }
}
