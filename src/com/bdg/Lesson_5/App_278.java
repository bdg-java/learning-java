package com.bdg.Lesson_5;

public class App_278 {
    public static void main(String[] args) {
        char[] a = {'a', 'e', 'd', 't', 'r', 'r', 'j', 'z'};
        char[] b = new char[a.length];
        int c = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] %2 != 0) {
                b[c] = a[i];
                c++;
            }
        }
        System.out.println(b);
    }
}
