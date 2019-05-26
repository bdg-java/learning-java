package com.bdg.lessonarrays;

public class App_230 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);

        int k = 2;
        int sum = 0;
        int count = 0;
        for (int i=0;i<array.length;i++) {
            if(array[i]%k == 0 ){
                int square = (int) Math.pow(array[i],2);
                sum = sum + square;
                count = count+1;
            }
        }
        System.out.println((double) Math.sqrt(sum/count));
    }
}
