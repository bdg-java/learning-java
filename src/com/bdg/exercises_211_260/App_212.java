package com.bdg.exercises_211_260;

public class App_212 {

    public static void main(String[] args) {
        int[] defaultArray = IntegerArrayOperations.getDefaultArray();
        double sum = 0;
        double result;
        int count = 0;
        for (int i = 0; i < defaultArray.length; i++) {
            if (defaultArray[i] > 0) {
                count++;
                sum = sum + Math.pow(defaultArray[i], 2);
            }
        }
        result = Math.sqrt((sum / count));
        System.out.println(result);

    }


}
