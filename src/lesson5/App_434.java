package lesson5;

public class App_434 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int x = matrix.length;
        double a = 5.4;
        double b = 15.3;
        int sum = 0;

        for (int i = 0; i < x; i++) {
            for (int k = x - i - 1; k < x; k++){
                if (Math.abs(matrix[i][k]) >= a && Math.abs(matrix[i][k]) <= b)
                    sum += matrix[i][k];
            }
        }
        System.out.println(sum);
    }

    }
