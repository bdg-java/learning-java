package ahakobyan.algorithms;

import java.util.Arrays;




public class BubbleSort {
    public static void main(String[] args) {


        int[] array = {27,4,3,6,15,14};
        boolean need = true;
        System.out.println(Arrays.toString(array));

        while(need) {
            need = false;
            for (int i =1; i < array.length; i++) {
                if (array[i] < array[i -1]) {
                    swap(array, i, i-1);
                        need = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}