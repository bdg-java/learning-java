package com.bdg.nhakobyan.lesson_5;

public class exercise_213 {
    public static void main(String[] args) {
        int [] array = new int[3];
        double average = 0;
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(-10 +Math.random()*(-20));
            System.out.print(array[i]+" ");
            average = Math.sqrt(Math.pow(array[i],2)/array.length);
        }
        System.out.println();
        System.out.println("average is "+ average);
    }
}
