package com.bdg.nhakobyan.lesson_7.exercisesFrom_321;

import java.util.Arrays;

public class exercise_323 {
    public static void main(String[] args) {
        int[] array = {10, 13, 25, 5, 12, 2, 22, 4, 32, 7};
        int max = array[0];
        int min = array[0];
        int num = 0;
        int count = 0;
        int average = (max + min)/2;
        System.out.print(Arrays.toString(array));
        System.out.println("\n"+average);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max ){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
            if (array[i]>average){
                count++;
            }
        }
        int [] vektor = new int[count];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > average){
                vektor[num] = array[i];
                num++;
            }
        }
        System.out.println(Arrays.toString(vektor));
    }
}
