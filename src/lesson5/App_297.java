package lesson5;

import lesson4.IntegerArrayOperations;

import java.util.Arrays;

public class App_297 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int x = 0;
        int count = 0;
        int k = 3;
        int[] newarray = new int[array.length - 0];

        for (int i = 0; i < array.length; i++) {
            x++;
        }

        System.out.println(Arrays.toString(newarray));
    }
    private static int getCount(int[] array, int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > k) {
                count++;
            }
        }
        return count;
    }
}
