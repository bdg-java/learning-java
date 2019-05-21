package lesson5;

import lesson4.IntegerArrayOperations;

import java.util.Arrays;

public class App_300 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int x = 0;
        int count = 0;
        int k = 8;
        int[] newarray = new int[array.length - 0];

        for (int i = 0; i < array.length; i++) {
            if (Math.pow(array[i],2) >= k) {
                newarray[x] = array[i];
                x++;
            }
        }

        System.out.println(Arrays.toString(newarray));
        System.out.println(Arrays.toString(newarray));
    }
    private static int getCount(int[] array, int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.pow(array[i], 2) < k) {
                count++;
            }
        }
        return count;
    }
}
