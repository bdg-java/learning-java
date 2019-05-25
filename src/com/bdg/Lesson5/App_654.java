package com.bdg.Lesson5;

public class App_654 {
    public static void main(String[] args) {
        int count = 0;
        char array [] = {'a','b', 'c', 'd','o','k','c','a'};
        int len = array.length;
        char[] y = new char[len];
        for(int i = 0; i < len; i++ ){
            if (array[i] != 'k') {
                y[i] =array[i];
                System.out.println(y[i]);
            }
        }
    }
}
