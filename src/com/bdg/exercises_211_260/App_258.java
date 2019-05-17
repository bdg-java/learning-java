package com.bdg.exercises_211_260;

public class App_258 {
    public static void main(String[] args) {
        int[] defaultArray = IntegerArrayOperations.getDefaultArray();
        int max = defaultArray[0];
        int index = 0;
        for (int i = 1; i < defaultArray.length; i++) {
            if (defaultArray[i] >= max) {
                max = defaultArray[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
