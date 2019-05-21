package lesson5;

import lesson4.IntegerArrayOperations;

public class App_291 {
    public static void main(String[] args) {

        int x = 0;
        int[] array = IntegerArrayOperations.getDefaultArray();
        int count = getCountOfNegativeValues(array);
        int[] newarray = new int[count];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                newarray[x] = array[i];
                x++;
            }
        }
        System.out.println(array.toString(newarray));

    }
    private static int getCountOfNegativeValues(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count ++;
            }
        }
        return count;

    }
}
