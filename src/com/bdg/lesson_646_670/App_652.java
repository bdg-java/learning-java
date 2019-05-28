package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_652 {
    public static void main(String[] args) {
        char[] array1 = {'w', 'z', 'e', 'g', 'z', 'a'};
        char[] array2 = {'w', 'z', 'e', 'g', 'j', 'a'};
        SetCharArray.displayArray(array1);
        SetCharArray.displayArray(array2);
        char element = 0;
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                count++;
                element = array1[i];
                char[] array3 = new char[] {element};
                System.out.println(array3);
            }
        }
    }
}
