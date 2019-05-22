package com.bdg.nhakobyan.lesson_7.exercises_from_271_to_300;

public class exercise_275 {
    public static void main(String[] args) {
        int n = 15;
        char array [] = new char[n];
        int count = 0;
        for (int i = 0; i < n ; i++) {
            array[i] = (char)(Math.random()*(122-97+1)+97);
            System.out.print(array[i]+" ,");
            if (array[i] < 'k'){
                count++;
            }
        }
        System.out.println("\n"+ count);
    }
}
