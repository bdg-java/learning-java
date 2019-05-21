package lesson5;

public class App_425 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int count = 0;

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] % 2 == 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
