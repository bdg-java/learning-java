package Exercises;

public class Task251 {
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 6, 7, 5, 4};
        int max = array[0];

        for (int i = 1; i < array.length; i ++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);
    }
}
