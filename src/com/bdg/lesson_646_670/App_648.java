package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_648 {
    public static void main(String[] args) {
        char[] array = {'w', 'x', '0', '0', '0', 'f', 'z'};
        SetCharArray.displayArray(array);
        int count = 0;

        for (int i = 0; i<array.length;i++) {
            if(array[i] == 'x') {
                for (int j = 0; j<array.length;j++) {
                    if (array[j] == '0') {
                        count++;
                    }
                }
            }
        } System.out.println(count);
    }
}
