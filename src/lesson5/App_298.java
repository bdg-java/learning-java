package lesson5;

import lesson4.IntegerArrayOperations;

import java.util.Arrays;

public class App_298 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int x = 0;
        int count = 0;
        int[] newarray = new int[array.length - 0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                newarray[x] = array[i];
                x++;
            }
        }

        System.out.println(Arrays.toString(newarray));
    }
    private static int getCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
