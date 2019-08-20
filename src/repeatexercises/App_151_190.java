package repeatexercises;

import java.util.ArrayList;
import java.util.Arrays;

public class App_151_190 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(app176(9)));
        System.out.println(app187(1));
        System.out.println("fibonacci");
        System.out.println(app188(1));
        System.out.println(app188(2));
        System.out.println(app188(5));
        System.out.println(app188(9));
        System.out.println(app188(56));
        System.out.println(app188(34));
        System.out.println(app188(1));
    }

    public static int[] app176(int n) {
        int[] fibonacci = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

        }

        return fibonacci;
    }

    public static boolean app187(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }


    public static boolean app188(int n) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        for (int i = 0; ; i++) {
            if (i == 0 || i == 1) {
                fibonacci.add(i);
            } else {
                fibonacci.add(fibonacci.get(i - 2) + fibonacci.get(i - 1));
                if (fibonacci.get(i - 2) + fibonacci.get(i - 1) == n) {
                    return true;
                } else if (fibonacci.get(i - 2) + fibonacci.get(i - 1) > n) {
                    return false;
                }

            }

        }

    }

}
