package lesson5;

public class App_429 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int count = 0;
        int x = matrix.length;

        for (int i = 0; i < x; i++) {
            for (int j = i; j < x; j++) {
                if (matrix[i][j] % 5 == 2) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
