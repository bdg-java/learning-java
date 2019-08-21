package com.bdg.Homework;

public class App_271 {
    public static void main(String[] args) {

        int count = 0;
        char[] a = { 'a', '4', 'Y', 'u', '4', 'a' };

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a')
                count++;
        }
        System.out.println(count);
    }
}
