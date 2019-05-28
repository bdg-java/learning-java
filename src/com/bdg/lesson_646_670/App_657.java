package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_657 {
    public static void main(String[] args) {
        char[] array = {'x', 'z', 'e', 'g', 'j', 't', 'o'};
        SetCharArray.displayArray(array);
        int len = array.length-1;
        char[] array_new = new char[len/2+1];

        int j = 0;
        for (int i = 0;i<len;i+=2) {
            if (array[i] > array[i+1]) {
                array_new[j]=array[i];
            } else {
                array_new[j] = array[i+1];
                j++;
            }
        }

        System.out.println(array_new);
    }
}
