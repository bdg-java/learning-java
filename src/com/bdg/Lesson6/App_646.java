package com.bdg.Lesson6;

public class App_646 {
    public static void main(String[] args) {
        int n = 10;
        int k = 0;
        char[] a = {'a','a','c','d','e','a','b','c','d','e'};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a')
            k++;

        }
        System.out.println(k);
    }

}