package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_658 {
    public static void main(String[] args) {
        char[] array = {'x', 'z', 'e', 'g', 'j', 't'};
        SetCharArray.displayArray(array);
        char[] array_new = new char[array.length];

        int j = 0;
        for (int i = 0;i<array.length;i+=2) {
            array_new[i]=array[i+1];
            array_new[i+1]=array[i];
            } System.out.println(array_new);
        }
    }

