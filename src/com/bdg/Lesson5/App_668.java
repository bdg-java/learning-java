package com.bdg.Lesson5;

public class App_668 {
    public static void main(String[] args) {
        int n = 2;
        int count = 0;
        char array[] = {'z', 'a', 'b', 'c', 'd', 'o', 'k', 'c', 'z', 'a', 'w', 'g'};
        int len = array.length;
        char[] y = new char[len - count];
        for (int i = 0; i < len; i++) {

            if( i%3 != 0){
                y[i] = array[i];
               System.out.println(y[i]);
            }



        }
    }
}
