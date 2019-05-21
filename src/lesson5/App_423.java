package lesson5;

public class App_423 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int count = 0;
        double sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (matrix[i][j] % 2 == 0)
                    count++;
                sum += Math.pow(matrix[i] [j], 2);
            }
        }
        if (count > 0)
            sum = Math.sqrt(sum / count);
        System.out.println(sum);
    }
}

