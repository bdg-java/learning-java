package lesson5;

public class App_437 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };

        int count = 0;
        int x = matrix.length;
        double sum = 0;

        for (int i = 1; i < x; i++) {
            for (int k = 0; k <= i; k++) {
                if (matrix[i][k] == matrix[i][k]) {
                    sum += Math.pow(matrix[i][k], 2);
                    count++;
                }
            }
        if (count > 0)
            sum = Math.sqrt(sum / count);
        System.out.println(sum);
    }
    }
}
