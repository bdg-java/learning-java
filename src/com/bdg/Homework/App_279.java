package com.bdg.Homework;

public class App_279 {
    public static void main(String[] args) {
        char[] a = {'a', 'k', 'd', 'l', 'r', 'r', 'j', 'z'};
        char[] b = new char[a.length];
        int c = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 'k') {
                b[c] = a[i];
                c++;
            }
        }
        System.out.println(b);
    }
}
