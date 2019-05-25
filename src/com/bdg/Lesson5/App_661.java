package com.bdg.Lesson5;

public class App_661 {
    public static void main(String[] args) {
        char array[] = {'z', 'a', 'b', 'v', 'd', 'o', 'k', 'c', 'z', 'a', 'w', 'g'};
        int len = array.length;

        char[] y = new char[len];
        for (int i = 0; i < len; i++) {

            if( array[i] == 'v'){
                break;

            }else{
                y[i] = array[i];
            }
            System.out.println(y[i]);
        }
    }
}
