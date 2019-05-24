package lesson6;

public class App_452 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int a = 0;
        int b = 0;
        int x = matrix.length;
        for (int i = 0; i < x; i++) {
            for (int k = 0; k < x; k++) {
                if (k == x - 1 && i == x -1) {
                    a = matrix[i][k];
                }
                if(k == 0 && i == 0){
                    b = matrix[i][k];
                }

            }
        }
        System.out.println(Math.pow(a,2) + " " +Math.pow(b,2));    }
}
