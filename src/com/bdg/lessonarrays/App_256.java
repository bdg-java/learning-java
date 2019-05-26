package com.bdg.lessonarrays;

public class App_256 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);

        int sum = 0;
        int minValue = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue && i < index) {
                index = i;
                minValue = array[i];
                sum = minValue + index;
            }
        }
        System.out.println(sum);
    }
}
