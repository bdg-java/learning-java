package com.bdg.Lesson_Arrays_2;

public class App_280 {
    public static void main(String[] args) {
        char[] array = SetCharArray.getDefaultCharArray();
        SetCharArray.displayArray(array);
        char[] array_new = new char[array.length*2];

        int j = 0;
        for (int i = 0;i<array.length;i++) {
            if (array[i] == 'f') {
                 array_new[i+j]='f';
                 array_new[i+j+1]= 'f';
                 j++;
            } else {
                 array_new[i+j] = array[i];
            }
        }

        System.out.println(array_new);
    }
}
