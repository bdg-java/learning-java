package Exercises;

public class Task232 {
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 6, 7, 0, 4};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                count += 1;
            }
        }
        System.out.println(count);

    }
}
