package exemples;

public class Erankyun {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        char[][] array = new char[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int k = 0; k < i + 1; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) {
                if (k <= i) {
                    array[i][k] = '*';
                } else {
                    array[i][k] = ' ';
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(array[i][k]);
            }
            System.out.println();
        }
    }
}
