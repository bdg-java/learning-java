package oldhomeworks;

import java.util.Arrays;
import java.util.Random;

public class IntArray {
    private static final int[] arr = {2, -8, 3, 5, -7, 10, 25, -12, 36, 45};

    public static void displayArray(int[] array) {
        System.out.println(Arrays.toString(array));

    }

    public static int[] getDefaultArray() {
        return arr;
    }

    public static int[] generateArrayWithRandomNumbers(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        return array;
    }


    public static int getMinElementOfArray(int[] generateArrayWithRandomNumbers) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;

    }

}
