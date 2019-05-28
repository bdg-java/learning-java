package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_659 {
    public static void main(String[] args) {
        char[] array = {'g', 'c', 'd', 'y', 'j', 't'};
        SetCharArray.displayArray(array);
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0;j<array.length;j++) {
                if (array[i] == 'c' && array[j]=='x') {
                    count++;
                }
            }
        } for (int k = 0;k<array.length;k++) {
            if (array[k] == 'd') {
                count++;
            }
        }
        System.out.println(count);
    }
}