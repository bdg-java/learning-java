package com.bdg.Lesson_Arrays_2;

public class App_277 {
    public static void main(String[] args) {
        char[] array = SetCharArray.getDefaultCharArray();
        SetCharArray.displayArray(array);
        char[] array_new = new char[array.length];

        for (int i = 0; i<array.length; i++) {
            if (array[i] != 'd') {
                 array_new[i]=array[i];
            }
        } System.out.println(array_new);
    }
}
