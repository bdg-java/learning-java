package lesson5;

public class App_424 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int count = 0;
        int sum = 0;

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (matrix[i][j] % 2 != 0)
                    count++;
                sum += matrix[i][j];
            }
        }
        System.out.println(sum / count);
    }
}
