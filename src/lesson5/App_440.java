package lesson5;

public class App_440 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int x = matrix.length;
        double sum = 0;

        for (int i = 1; i < x; i++) {
            for (int k = i + 1; k < i; k++) {
                if ((i + k) % 2 == 0) {
                    sum += matrix[i][k];
                }
            }

            System.out.println(sum);
        }
        }

}
