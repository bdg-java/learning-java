package com.bdg.nhakobyan.lesson_7.exercises;

public class exercise_276 {
    public static void main(String[] args) {
        int n = 15;
        char array [] = new char[n];
        boolean t = false;

        for (int i = 0; i < n ; i++) {
            array[i] = (char)(Math.random()*(122-97+1)+97);
            System.out.print(array[i]+" ,");
            if (array[i] == 'r'){
                t = true ;
            }
        }
        System.out.println("\n"+t);
    }
}
