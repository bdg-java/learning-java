package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_655 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'e', 'g', 'j', 'k'};
        SetCharArray.displayArray(array);
        char[] array_new = new char[array.length];

        for (int i = 0;i<array.length;i++) {
                array_new[i]=array[array.length-i-1];
        }

        System.out.println(array_new);
    }
}
