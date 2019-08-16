package Exercises;

public class Task226 {
    public static void main(String[] args) {
        int k = 2;
        int[] array = {1, 2, -5, 8, 6, 7, 0};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < k) {
                count += 1;
            }
        }

                System.out.println(count);
            }
        }


