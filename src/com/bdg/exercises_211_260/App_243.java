package com.bdg.exercises_211_260;

public class App_243 {

    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.generateArrayWithRandomNumbers(20);
        int t =64;
        int count =0;
        for (int i = 1;i<array.length;i++){
            if(t%i == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
