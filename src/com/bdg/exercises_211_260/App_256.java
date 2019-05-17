package com.bdg.exercises_211_260;

public class App_256 {

    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.generateArrayWithRandomNumbers(15);
        int min = array[0];
        int index = 0;
        for(int i=1;i<array.length;i++){
            if(array[i] < min){
                min = array[i];
                index = i;
            }
        }
        System.out.println(min+index);
    }
}
