package com.bdg.nhakobyan.lesson_7;
import static com.bdg.other.getArrayRandomNumbers.randomArrayNumbers;
import static com.bdg.nhakobyan.arrayPrint.printArray;
public class exercise_451 {
    public static void main(String[] args) {
        int m = 5;
        int [][] array = new int[m][m];
        int [] b = new int[2];
        randomArrayNumbers(array,10,99);
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                b[0] = (array[0][0]+array[5][5])/2;
                b[1] = (array[5][0]+array[0][5])/2;

            }
        }
        printArray(b);
    }
}
