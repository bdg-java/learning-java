package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_670 {
    public static void main(String[] args) {
        char[] array = {'g', 'c', 'd', 'y', 'j', 't'};
        SetCharArray.displayArray(array);
        int count = 0;

        for (int i = 1;i<array.length-1;i++) {
            if (array[i]>array[i-1] && array[i]>array[i+1]) {
                count++;
                char b = array[i];
                System.out.println(b);
            }
        }
        System.out.println(count);
    }
}
