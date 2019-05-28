package com.bdg.lesson_646_670;

public class App_651 {
    public static void main(String[] args) {

        char[] array = {'a', '5', 'a', 'n', 'g', 'b', 'n'};

        char[] noDuplicateTmp = new char[array.length];
        char[] noDuplicate = null;

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
                noDuplicateTmp[k] = found;
                k++;
            }
            count = 0;}

        if (k > 0) {
            noDuplicate = new char[k];

            for (int i = 0; i < k; i++) {
                noDuplicate[i] = noDuplicateTmp[i];
            }

            System.out.println(noDuplicate);
        }
    }
}

