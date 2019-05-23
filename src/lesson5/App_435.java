package lesson5;

public class App_435 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };

        int count = 0;
        int x = matrix.length;

        for (int i = 0; i < x; i++) {
            for (int k = 0; k < x - 1; k++) {
                if (( matrix[i][k]) % 5 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
