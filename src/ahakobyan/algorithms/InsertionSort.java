package ahakobyan.algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {27,4,3,6,15,14};
        System.out.println(Arrays.toString(array));

        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left -1;
            for (; i >=0 ; i--) {
                if (value < array[i]) {
                    array[i+1] = array[i];

                }else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind2];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
