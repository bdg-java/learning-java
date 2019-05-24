package lesson6;

public class App_455 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int a = 1;
        int b = 1;
        int x = matrix.length;
        for (int i = 0; i < x; i++) {
            for (int k = 0; k < x; k++) {
                        if (k == i) {
                            a *= matrix[i][k];

                        }
                        if(k == x -i - 1){
                            b *= matrix[i][k];
                        }
                    }
                }
                System.out.println(a * b);
            }
}
