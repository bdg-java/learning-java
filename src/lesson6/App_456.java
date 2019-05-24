package lesson6;

public class App_456 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };

        int x = matrix.length;
        int count = 0;

        for (int i = 0; i < x; i++) {
            for (int k = 0; k < x; k++) {
                if (matrix[i][k] > 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
            }

}
