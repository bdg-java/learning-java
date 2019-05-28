package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_653 {
    public static void main(String[] args) {
        char[] array = {'a', 'z', 'e', 'g', 'j', 'a'};
        SetCharArray.displayArray(array);
        char[] array_new = new char[array.length*2];

        int j = 0;
        for (int i = 0;i<array.length;i++) {
            if (array[i] == 'a') {
                array_new[i+j]='a';
                array_new[i+j+1]= 'c';
                j++;
            } else {
                array_new[i+j] = array[i];
            }
        }

        System.out.println(array_new);
    }
}
