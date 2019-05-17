package com.bdg.lesson_Arrays;

public class App_227 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int k=3;
        int sum = 0;
        int count = 0;
        for (int i=0;i<array.length;i++) {
            if(i%k == 0){
                sum += array[i];
                count = count+1;
            }
        }
        System.out.println((double) sum/count);
    }
}
