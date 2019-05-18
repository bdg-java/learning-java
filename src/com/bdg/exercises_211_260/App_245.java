package com.bdg.exercises_211_260;

public class App_245 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.generateArrayWithRandomNumbers(10);
        int sum = 0;
        for (int i= 0;i<array.length;i++){
            if((array[i]+i)%3 == 0){
                sum+=Math.pow(array[i],2);
            }
        }
        System.out.println(sum);

    }
}
