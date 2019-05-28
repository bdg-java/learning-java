package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_654 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'e', 'g', 'j', 'a'};
        SetCharArray.displayArray(array);
        char[] array_new = new char[array.length];

        for (int i = 0;i<array.length;i++) {
            if (array[i] != 'a') {
                array_new[i]=array[i];
            }
        }

        System.out.println(array_new);
    }
}
