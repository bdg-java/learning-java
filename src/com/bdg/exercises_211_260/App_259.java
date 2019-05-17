package com.bdg.exercises_211_260;

public class App_259 {
    public static void main(String[] args) {
        int[] defaultArray = IntegerArrayOperations.getDefaultArray();
        int min = defaultArray[0];
        int index = 0;
        for (int i = 1; i < defaultArray.length; i++) {
            if (defaultArray[i] < min) {
                min = defaultArray[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
