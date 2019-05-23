package lesson5;

public class App_431 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {2, 3, 6, 9},
                    {5, 4, 6, 6},
                    {8, 3, 1, 7},
            };

            int count = 0;
            int x = matrix.length;
            for (int i = 0; i < x; i++) {
                for (int k = x - i - 1; k < x; k++) {
                    if ((i + k) % 2 != 0)
                        count++;
                }
            }
            System.out.println(count);
        }
}
