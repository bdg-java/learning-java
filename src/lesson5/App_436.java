package lesson5;

public class App_436 {
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
        int sum = 0;

        for (int i = 1; i < x; i++) {
            for (int k = 0; k < i; k++) {
                if (matrix[i][k] >= a && matrix[i][k] <= b)
                    count++;
                sum += matrix[i][k];
            }
        }
        System.out.println(sum / count);
    }
}
