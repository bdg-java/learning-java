package Exercises;

public class Task440 {
    public static void main(String[] args) {
        int[][] matr = {
                {5, 2, 3, 6, 0, 8},
                {2, 1, 3, 8, 9, 5},

        };
        int n = matr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < i; k++) {
                if ((i + k) % 2 == 0)
                    sum += matr[i][k];
                }
            }

            System.out.println(sum);
        }

    }

