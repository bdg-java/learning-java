package com.bdg.lesson_Arrays;

public class App_217 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);

        int product = 1;
        for (int i=0;i<array.length;i++) {
            if(i%2 != 0 ){
                int square = (int) Math.pow(array[i],2);
                product *= square;
            }
        }
        System.out.println(product);
    }
}
