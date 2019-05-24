package lesson6;

public class App_451 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int a = 0;
        int b = 0;
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                if (k == i) {
                    a = matrix[i][k];
                    count ++;
                }
                if(k == matrix.length - i - 1){
                    b = matrix[i][k];
                    count ++;
                }
            }
        }
        System.out.println(a + b / count);




    }

}
