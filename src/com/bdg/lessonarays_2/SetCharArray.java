package com.bdg.lessonarays_2;

import java.util.Arrays;

public class SetCharArray {
        private static final char[] SPECIFIC_CHAR_ARRAY = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'b', 'b', 'b', 'b', 'b'};
        private static final char[] CHAR_ARRAY = {'f', 'b', 'c', 'd', 's', 'f', 'a', 'r', 'H', 'b', 'k', 's'};
        public static void displayArray(char[] array) {
        System.out.println(Arrays.toString(array));
    }

        public static char[] getSpecificCharArray() {
            return SPECIFIC_CHAR_ARRAY;
        }

        public static char[] getDefaultCharArray() {
        return CHAR_ARRAY;
       }

    }

