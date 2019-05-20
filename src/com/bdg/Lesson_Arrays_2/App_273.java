package com.bdg.Lesson_Arrays_2;

public class App_273 {
    public static void main(String[] args) {
        char[] array = SetCharArray.getDefaultCharArray();
        SetCharArray.displayArray(array);

        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i] == 's') {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
