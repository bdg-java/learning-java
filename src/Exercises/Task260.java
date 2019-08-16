package Exercises;

public class Task260 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 6, 7, 5, 4, 1};
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] <= min) {
                min = array[i];
                index = i;
            }
        }

            System.out.println(index);
        }
    }


