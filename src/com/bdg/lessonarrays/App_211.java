package com.bdg.lessonarrays;

public class App_211 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int sum = 0;
        int count = 0;
        for (int i=0;i<array.length;i++) {
            sum = sum + array[i];
            count = count+1;
        }
        System.out.println((double) sum/count);
    }
}
