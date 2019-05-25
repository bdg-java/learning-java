package com.bdg.Lesson5;

public class App_660 {
    public static void main(String[] args) {
        int n = 2;
        int sum = 0;
        char array[] = {'z', 'a', 'b', 'c', 'd', 'o', 'k', 'c', 'z', 'a', 'w', 'g'};
        int len = array.length;

        char[] y = new char[len];
        for (int i = 0; i < len; i++) {

            if( i == n){
                y[i] = 'a';
                n+=3;

            }else{
                y[i] = array[i];
            }
            System.out.println(y[i]);
        }
    }
}
