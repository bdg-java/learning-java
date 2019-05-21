package lesson5;

import lesson4.IntegerArrayOperations;

import java.util.Arrays;

public class App294 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int x = 0;

        for (int i = 0; i < array.length; i += 2) {
            x++;
        }
        int[] newarray = new int [x];
        for (int i = 0; i < array.length; i += 2) {
            newarray[x] = array[i];
            x++;
    }
        System.out.println(Arrays.toString(newarray));

    }
}
