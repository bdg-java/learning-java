package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_650 {
    public static void main(String[] args) {
        char[] array1 = {'w', 'z', 'e', 'g', 'z', 'a'};
        char[] array2 = {'w', 'z', 'e', 'g', 'z', 'a'};
        SetCharArray.displayArray(array1);
        SetCharArray.displayArray(array2);
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    count++;
                }
            }
        System.out.println(count);
    }
}
