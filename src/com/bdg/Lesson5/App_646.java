package com.bdg.Lesson5;

public class App_646 {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        char array [] = {'a','b', 'c', 'd','o','k','c','a'};
        int len = array.length;

        for(int i = 0; i < len; i++ ){
            if (array[i] == 'a') {
               count ++;
            }
        }
        System.out.println(count);
    }
}
