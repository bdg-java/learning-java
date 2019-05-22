package com.bdg.nhakobyan.lesson_7.exercisesFrom_321;

import java.util.Arrays;

public class exercise_321 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 5, 6, 6, 22, 4, 33, 55};
        int max = array[0];
        int num = 0;
        int index = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        for (int i = 0; i < index ; i+=2) {
            count++;
        }
        System.out.print(Arrays.toString(array));

        System.out.print("\n" + "max is: " + max + " max index is: "+index );
        System.out.println();
        int[] vektor = new int[count];
        for (int i = 0; i <= index; i++) {
            if (i % 2 == 0){
                    vektor[num] = array[i]+max;
                    num++;
                }

        }
        System.out.print(Arrays.toString(vektor));
    }
}

