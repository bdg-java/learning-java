package com.bdg.Lesson_Arrays_2;

public class App_276 {
    public static void main(String[] args) {
        char[] array = SetCharArray.getDefaultCharArray();
        SetCharArray.displayArray(array);

        boolean t = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'r') {
                t = true;
                break;
            } else {
                t = false;
            }
        }   System.out.println(t);
    }
}
