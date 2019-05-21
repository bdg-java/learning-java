package lesson5;

import lesson4.IntegerArrayOperations;

import java.util.Arrays;

public class App_293 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int a = 8;
        int b = 12;
        int x = 0;
        int[] newarray = new int[b - a + 1];
        for (int i = a; i <= b; i++) {
            newarray[x] = array[i];
            x++;
        }
        System.out.println(Arrays.toString(newarray));
    }
    }

