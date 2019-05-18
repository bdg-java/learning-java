package com.bdg.exercises_211_260;

public class App_244 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.generateArrayWithRandomNumbers(10);
        int multiply = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] % 5 == 2) {
                multiply *= array[i];
            }
        }
        System.out.println(multiply);
    }
}
