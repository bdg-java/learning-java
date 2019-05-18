package com.bdg.exercises_211_260;

public class App_239 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.generateArrayWithRandomNumbers(7);
        int average = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                count++;
                average += Math.pow(array[i], 2);
            }
        }
        if (count != 0) {
            System.out.println(Math.sqrt(average / count));
        }

    }
}
