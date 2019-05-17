package com.bdg.exercises_211_260;

public class App_252 {

    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.generateArrayWithRandomNumbers(20);
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
}
