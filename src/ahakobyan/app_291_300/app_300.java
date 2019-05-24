package ahakobyan.app_291_300;

import ahakobyan.IntegerArrayoperations;

import java.util.Arrays;

public class app_300 {
    public static void main(String[] args) {

        int[] x = IntegerArrayoperations.getDefaultArray();
        int[] y = new int[x.length];
        int k = 9;
        int a =0;

        for (int i = 0; i < x.length; i++) {
            if ((x[i] * x[i]) < k) {
                y[a] = x[i];
                a++;
            }
        }
        System.out.println(Arrays.toString(y));
    }
}
