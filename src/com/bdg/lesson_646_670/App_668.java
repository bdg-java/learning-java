package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_668 {
    public static void main(String[] args) {
        char[] array = {'g', 'c', 'd', 'y', 'j', 't'};
        SetCharArray.displayArray(array);
        char[] new_array = new char[array.length];

        for (int i = 0;i<array.length;i++) {
            if (i%3!=0) {
                new_array[i] = array[i];
            }
        }
        System.out.println(new_array);
    }
}
