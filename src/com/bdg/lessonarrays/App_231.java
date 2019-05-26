package com.bdg.lessonarrays;

public class App_231 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);

        int sum = 0;
        int count = 0;
        for (int i=0;i<array.length;i++) {
            if(array[i]%2 == 0 ){
                int square = (int) Math.pow(array[i],2);
                sum = sum + square;
            }
        }
        System.out.println(sum);
    }
}
