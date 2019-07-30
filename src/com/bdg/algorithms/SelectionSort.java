package src.com.bdg.algorithms;

import src.com.bdg.other.getArrayRandomNumbers;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = new int[10];
        getArrayRandomNumbers.randomArrayNumbers(array,99,2);

        int min, in,out;
        for (out = 0; out < array.length ; out++) {
            min = out;
            for (in = out; in < array.length ; in++) {
                if (array[in] < array[min]) {
                    min = in;
                }
            }
            swap(array,min,out);
        }
        System.out.println(Arrays.toString(array));
    }
    public static void swap ( int[] array, int ind1, int ind2){
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
