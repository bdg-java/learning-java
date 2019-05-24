package lesson6;

public class App_458 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int x = matrix.length;
        int count = 0;
        int k = 5;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if(matrix[i][j] + k == matrix[i][j]-k ){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
