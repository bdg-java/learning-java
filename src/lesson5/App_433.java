package lesson5;

public class App_433 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };

        int count = 0;
        int x = matrix.length;
        int a = 5;
        int b = 10;

        for (int i = 0; i < x; i++) {
            for (int k = 0; k < x - i - 1; k++) {
                if (matrix[i][k] >= a && matrix[i][k] <= b)
                    count++;
            }
        }
        System.out.println(count);
    }
}
