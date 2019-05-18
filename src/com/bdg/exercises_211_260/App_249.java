package com.bdg.exercises_211_260;

public class App_249 {
    public static void main(String[] args) {
        int count = 0;
        int k =8;
        int[] array = IntegerArrayOperations.generateArrayWithRandomNumbers(20);
        for (int i=0;i<array.length;i++){
            if(Math.abs(array[i] -i ) >k){
                count++;
            }
        }
        System.out.println(count);
    }
}
