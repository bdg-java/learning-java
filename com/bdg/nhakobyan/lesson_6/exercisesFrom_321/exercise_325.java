package com.bdg.nhakobyan.lesson_6.exercisesFrom_321;

import java.util.Arrays;

public class exercise_325 {
    public static void main(String[] args) {
        int[] array = {10, 13, 25, 5, 12, 2, 22, 4, 32, 7};
        int max = arrayMax(array);
        System.out.print(Arrays.toString(array));
//        System.out.println(max);
        int temp = 0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] == max){
                temp = array[i];
                array[i] = array[0];
                array[0] = temp;
            }
        }
        System.out.print("\n"+Arrays.toString(array));



    }
    public static int arrayMax(int [] array ){
        int max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
