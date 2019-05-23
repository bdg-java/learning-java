package lesson5;

public class App_439 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int x = matrix.length;
        int mult = 1;

        for (int i = 0; i < x; i++) {
            for (int k = i + 1; k < i; k++) {
                if ((i + k) % 2 != 0 && matrix[i][k] != 0)
                    mult *= matrix[i][k];
            }
        }
        System.out.println(mult);
    }
}

