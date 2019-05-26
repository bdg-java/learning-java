package com.bdg.lessonarays_2;

public class App_274 {
    public static void main(String[] args) {
        char[] array = SetCharArray.getDefaultCharArray();
        SetCharArray.displayArray(array);

        int sum = 0;
        int count = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i] > 'h') {
                sum = sum + i;
                count++;
            }
        }
        System.out.println((double) sum/count);
    }
}
