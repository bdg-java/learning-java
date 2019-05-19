package com.Lesson5;

public class App_271 {
    public static void main(String[] args) {
        int n = 11;
        int c = 0;
        char[] a = {'a', 'b', 'c','a','k','j'};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a')
                c++;
        }
        System.out.println(c);
    }
}

