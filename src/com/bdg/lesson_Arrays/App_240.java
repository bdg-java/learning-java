package com.bdg.lesson_Arrays;

public class App_240 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int count = 0;
        for (int i=0;i<array.length;i++) {
            if(array[i]%7 == 0 ){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
