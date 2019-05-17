package com.bdg.lesson_Arrays;

public class App_213 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);

        int sum = 0;
        int count = 0;
        for (int i=0;i<array.length;i++) {
            int square = (int) Math.pow(array[i],2);
            sum = sum + square;
            count = count+1;
        }
        System.out.println(Math.sqrt(sum/count));
    }
}
