package Exercises;

public class Task425 {
    public static void main(String[] args) {

        int[][] matr = {
                {5, 2, 3, 6, 0, 8},
                {2, 1, 3, 8, 9, 5},
        };
        int count = 0;
        for (int i = 1; i < matr.length; i++) {
            for (int k = 0; k < i; k++) {
                if (matr[i][k] % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
