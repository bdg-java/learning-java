package com.bdg.Lesson_Arrays_2;

public class App_271 {
    public static void main(String[] args) {
        char[] array = SetCharArray.getDefaultCharArray();
        SetCharArray.displayArray(array);

        int count = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i] == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
