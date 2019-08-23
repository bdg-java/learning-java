package com.bdg.nhakobyan.lesson_7;

import static com.bdg.other.getArrayRandomNumbers.randomArrayNumbers;

public class exercise_461 {
    public static void main(String[] args) {
        int m = 5;
        int [][] array = new int[m][m];
        int a = 29;
        int b = 70;
        randomArrayNumbers(array,1,9);
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (Math.pow(array[i][j],2)>= a && Math.pow(array[i][j],2) <= b )
                    count++;
            }
        }
        System.out.println(count);
        int [] vektor = new int[count];
        int num = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (Math.pow(array[i][j],2)>= a && Math.pow(array[i][j],2) <= b ) {
                    vektor[num] = array[i][j];
                    num++;
                }
            }
        }
        printArray(vektor);
    }
    public static void printArray(int [] array ){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }

}
