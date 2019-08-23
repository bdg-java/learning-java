package com.bdg.nhakobyan.lesson_7;


/**
 * @author William Arustamyan
 */


public class App_651 {

    public static void main(String[] args) {

        char[] array = {'a', '5', 'a', 'n', 'g', 'b', 'n'};

        char[] noDuplicate = new char[array.length];

        int k = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            char found = array[i];
            for (int m = 0; m < array.length; m++) {
                if (array[i] == array[m]) {
                    count++;
                    found = array[m];
                }
            }
            if (count == 1) {
                noDuplicate[k] = found;
                k++;
            }
            count = 0;
        }
        System.out.println(noDuplicate);
    }
}
