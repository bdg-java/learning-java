package lesson5;

public class App_428 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int count = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 2; j++) {
                if (matrix[i][j] == 0) {
                }
            }
            System.out.println(count);
        }
    }
}
