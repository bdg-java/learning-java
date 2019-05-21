package lesson5;

import lesson4.IntegerArrayOperations;

import java.util.Arrays;

public class App_296 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int x = 0;
        int c = 0;
        int k = 5;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % k != 2) {
                c = c + 1;
            }
            }
            int[] newarray = new int[x];
            for (int i = 0; i < array.length; i++) {
                if (array[i] % k != 2) {
                    x++;
                }
                System.out.println(Arrays.toString(newarray));
            }
        }
    }

