package com.bdg.nhakobyan.lesson_6.exercises_from_271_to_300;

public class exercise_271 {
    public static void main(String[] args) {
        int n = 15;
        char array [] = new char[n];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (Math.random()*(97 - 63 + 1)+ 97 );
            System.out.print(array[i] +" ");
            if (array[i] == 'a'){
                count++;
            }
        }
        System.out.print("\n"+count+" ");

    }
}