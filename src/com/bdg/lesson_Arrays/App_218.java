package com.bdg.lesson_Arrays;

public class App_218 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int sum = 0;
        for (int i=0;i<array.length;i++) {
            if(i%2 != 0 ){
                int abs = (int) Math.abs(array[i]);
                sum += abs;
            }
        }
        System.out.println(sum);
    }
}
