package com.bdg.lessonarays_2;

public class App_275 {
    public static void main(String[] args) {
        char[] array = SetCharArray.getDefaultCharArray();
        SetCharArray.displayArray(array);

        int count = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i] < 'k') {
                count++;
            }
        }
        System.out.println(count);
    }
}
