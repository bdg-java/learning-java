package Exercises;

public class Task250 {
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 6, 7, 5, 4};
        int sum = 0;

        for (int i = 1; i < array.length; i++) {
            int value = array[i] * i;
            if(value % 3 == 2) {
                double x = Math.pow(value, 2);
                sum *= x;
            }
        }
        System.out.println(sum);
    }
}
