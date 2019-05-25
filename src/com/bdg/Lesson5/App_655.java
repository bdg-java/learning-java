package com.bdg.Lesson5;

import java.lang.reflect.Array;

public class App_655 {
    public static void main(String[] args) {
        char n = 0;
        int sum = 0;
        char array[] = {'z', 'a', 'b', 'c', 'd', 'o', 'k', 'c', 'z', 'a', 'w', 'g'};
        int len = array.length;

        char[] y = new char[len];
        for (int i = 1; i < len; i++) {
            y[len - i - 1] = array[i];
            System.out.println(y);
        }

    }
}
