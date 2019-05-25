package com.bdg.Lesson5;

public class App_670 {
    public static void main(String[] args) {
        char array[] = {'z', 'a', 'b', 'v', 'd', 'o', 'k', 'c', 'z', 'a', 'w', 'g'};
        int len = array.length;
        int count = 0;

        char[] y = new char[len];
        for (int i = 1; i < len-1; i++) {

            if ( array[i] > array[i+1] && array[i]> array[i-1]) {
                 y[i] = array[i];
                 count++;

            }
        }
        System.out.println(count);
    }
}
