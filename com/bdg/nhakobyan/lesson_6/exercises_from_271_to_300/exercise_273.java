package com.bdg.nhakobyan.lesson_6.exercises_from_271_to_300;

public class exercise_273 {
    public static void main(String[] args) {
        int n = 25;
        char array [] = new char[n];
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            array[i] = (char)(Math.random()*(122-65+1)+65);
            System.out.print(array[i]+" , ");
            if (array[i] == 's'){
                sum++;
            }
        }
        System.out.println("\n"+sum);
    }
}
