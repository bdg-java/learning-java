package com.bdg.Homework;

public class App_273 {
    public static void main(String[] args) {

        int count = 0;
        char[] a = {'a', '4', 's', 's', '4', 'a'};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 's')
                count +=i;
        }
        System.out.println(count);
    }
}
