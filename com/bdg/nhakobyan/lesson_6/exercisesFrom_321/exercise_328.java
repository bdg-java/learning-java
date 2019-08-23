package com.bdg.nhakobyan.lesson_6.exercisesFrom_321;

import java.util.Arrays;

public class exercise_328 {
    public static void main(String[] args) {
        int[] array = {10, 13, 13, 10, 12, 2, 22, 4, 32, 4};
        int count = 0;
        int num = 0;
        System.out.print(Arrays.toString(array));
        for (int i = 0; i < array.length ; i++) {
            for (int j = num+1; j < array.length ; j++) {
                if (array[j] == array[num]) {
                    count++;
                }
            }
            num++;
        }

        num = 0;
//        System.out.print("\n"+count+" "+ num);
        int [] vektor = new int[count];
        for (int i = 0; i < array.length ; i++) {
            for (int j = 1; j < array.length ; j++) {
                if (array[num] != array[j]) {
                    array[num] = array[j];
                }
                /*if (j == array.length-1){
                    break;
                }*/
            }
            num++;
        }
        System.out.print("\n"+Arrays.toString(vektor));


    }
}
