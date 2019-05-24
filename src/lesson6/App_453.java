package lesson6;

public class App_453 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int a = 5;
        int b = 10;
        int x = matrix.length;
        int sum = 0;

        for (int i = 0; i < x; i++) {
            for (int k = 0; k < x; k++) {
                if (matrix[i][k] >= a && matrix[i][k] <= b) {
                    sum = matrix[i][k];
                    System.out.println(sum);
                }
            }
        }
            }
}
