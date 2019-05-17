package com.bdg.lesson_Arrays;

public class App_226 {
    public static void main(String[] args) {
    int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

    int t=88;
    int count = 0;
        for (int i=0;i<array.length;i++) {
        int abs = (int) Math.abs(array[i]);
        if(abs>t){
            count = count + 1 ;
        }
    }
        System.out.println(count);
     }
}