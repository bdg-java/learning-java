package com.bdg.exercises_211_260;

public class App_218 {
    public static void main(String[] args) {
        int[] defaultArray = IntegerArrayOperations.getDefaultArray();
        int sum = 0;
        for (int i = 1; i < defaultArray.length; i += 2) {
            sum += defaultArray[i];
        }
        System.out.println(sum);
    }


}
