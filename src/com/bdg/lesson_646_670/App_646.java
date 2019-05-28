package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_646 {
    public static void main(String[] args) {
        char[] array = SetCharArray.getDefaultCharArray();
        SetCharArray.displayArray(array);
        int count = 0;

        for (int i = 0; i<array.length;i++) {
            if(array[i] == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
