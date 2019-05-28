package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_647 {
    public static void main(String[] args) {
//        char[] array = SetCharArray.getDefaultCharArray();
        char[] array = {'w', 'o', 'o', 'o', 'w'};
        SetCharArray.displayArray(array);
        boolean t = true;

        for (int i = 0; i<array.length;i++) {
            if(array[i] == array[array.length-1-i]) {
                t = true;
            } else {
                t = false;
            }
        } System.out.println(t);
    }
}
