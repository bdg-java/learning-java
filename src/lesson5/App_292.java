package lesson5;

import lesson4.IntegerArrayOperations;

public class App_292 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int count = 0;
        int[] newarray = new int[getCountFromArray(array)];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 7 == 0) {
                newarray[count] = array[i];
                count++;
            }
        }
        System.out.println(array.toString());

    }
    private static int getCountFromArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 7==0) {
                count ++;
            }
        }
        return count;

    }
}
