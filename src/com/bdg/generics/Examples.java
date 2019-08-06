package com.bdg.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Examples {

    public static void main(String[] args) {
//        ArrayListImplementation<String> files = new ArrayListImplementation<>();
//        files.add("aaaa");
//        System.out.println(files);
//        String[] words = {"aaa", "aba","abc"};
//
//        Pair<String> stringPair = ArrayAlg.minmax(words);
//        // stringPair.setFirst("stringPair");
//        System.out.println(stringPair.getFirst());
//        System.out.println(stringPair.getSecond());
        /** ---- not working---why ,(with strings is fine,here we have to put int[] when test is invoked)
        int[] words = {12,343};
        int testStrong = test(words);
        System.out.println(testStrong);
         */
        int[] words = {4234,4234};
        int[] testStrong = test(words);
        System.out.println(testStrong);
    }


    public static <T> T test(T... a){
        return a[a.length-1];
    }
}


class ArrayAlg {
    /**
     * 21 * Gets the minimum and maximum of an array of strings.
     * 22 * @param a an array of strings
     * 23 * @return a pair with the min and max value, or null if a is null or
     * empty
     * 24
     */
    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}
