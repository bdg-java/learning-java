package com.bdg.Lesson5;

public class App_656 {
    public static void main(String[] args) {
        char n = 0;
        int m = 0;
        int count = 0;
        char array[] = {'z', 'a', 'x', 'c', 'd', 'o', 'k', 'c', 'z', 'a', 'w', 'g'};
        int len = array.length;


        for (int i = 0; i < len; i++) {
            if(array[i] == 'x') {
                array[i] = 'y' + 'y';
                count++;
                m = len + count;
                for (int k = 0; k < m; k++) {
                    char[] y = new char[m];
                    y[k] = array[k];
                    System.out.println(y[k]);
                }
            }
        }

    }

}
