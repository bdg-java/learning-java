package Exercises;

public class Task211 {
    public static void main(String[] args) {
        int [] array = {1, 2, -5, 8, 6, 7, 0};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
                System.out.println((double) sum / array.length);
            }
        }

    }

