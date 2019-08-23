package com.bdg.nhakobyan.lesson_6.exercises_from_271_to_300;

public class exercise_274 {
    public static void main(String[] args) {
        int n = 15;
        char array [] = new char[n];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            array[i] = (char) (Math.random() * (97 - 63 + 1) + 97);
            System.out.print(array[i]+" ");
            if (array[i] > 'h'){
                sum += i;
                count++;
            }
        }
        System.out.println("\n middle average is : "+ (float)sum/count);
    }
}
