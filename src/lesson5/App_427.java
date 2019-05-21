package lesson5;

public class App_427 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int mul = 1;
        int k = 5;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (matrix[i][j] % k == 0) {
                    mul *= matrix[i][j];
                }
            }
            System.out.println(mul);
        }
    }
}