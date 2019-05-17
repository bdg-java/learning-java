package com.bdg.exercises_211_260;

public class App_217 {

    public static void main(String[] args) {
        int[] defaultArray = IntegerArrayOperations.getDefaultArray();
        int multiply = 1;
        for (int i = 1; i < defaultArray.length; i += 2) {
            multiply *= Math.pow(defaultArray[i], 2);
        }
        System.out.println(multiply);

    }
}
