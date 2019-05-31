package com.bdg.nhakobyan.lesson_6.exercisesFrom_321;

import java.util.Arrays;

public class exercise_322 {
    public static void main(String[] args) {
        int[] array = {1, 0, 5, 5, 6, 0, 22, 4, 33, 0};
        int num = 0;
        int count = 0;
        System.out.print(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                count++;
            }
        }
        int [] vektor = new int[array.length+count*2];
        for (int i = 0; i < array.length ; i++) {
            vektor[num] = array[i];
            if (array[i] == 0){
                System.out.print("if");
                vektor[num+1] = array[i];
                vektor[num+2] = array[i];
                num+=2;
            }
            num++;
        }
        System.out.print(Arrays.toString(vektor));
    }
}
