package lesson5;

public class App_438 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int count = 0;
        int x = matrix.length;

        for (int i = 1; i < x; i++) {
            for (int k = 0; k <= i; k+= 2) {
                if (matrix[i][k] > 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
